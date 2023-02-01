const clock = document.querySelector("h2#clock");
const title = document.querySelector("h1#title")
const Form = document.querySelector("form#form")
const YearInput = document.querySelector("#yyyy");
const MonthInput = document.querySelector("#mm");
const DateInput = document.querySelector("#dd");
let WaitingDay = "";
const DayKey = "Waitingday";

const Clear = document.querySelector("#clear");

function time(){
    if (WaitingDay === null) {
        return;
    }
    const ADay = 1000*60*60*24;
    const WaitingDate = new Date(WaitingDay);
    const Nowdate = new Date();
    const RemainingDate = new Date(WaitingDate.getTime() - Nowdate.getTime() + Nowdate.getTimezoneOffset()*60*1000);
    const RemainingD = Math.trunc(RemainingDate/ADay);
    const RemainingH = String(RemainingDate.getHours()).padStart(2, "0");
    const RemainingM = String(RemainingDate.getMinutes()).padStart(2, "0");
    const RemainingS = String(RemainingDate.getSeconds()).padStart(2, "0");
    clock.innerText = 
    `${RemainingD}d ${RemainingH}h ${RemainingM}m ${RemainingS}s`;
}

function clearpage(){
    window.localStorage.clear();
    location.reload(true);
}

function Submited(refresh){
    refresh.preventDefault();
    const Month = MonthInput.value;
    const Day = DateInput.value;
    const Year = YearInput.value;
    WaitingDay = `${Year}-${Month}-${Day} 00:00:00`;
    title.innerText = `Time Until ${Year}/${Month}/${Day}`;
}

setInterval(time, 1000);
Form.addEventListener("submit", Submited);
Clear.addEventListener("click", clearpage)
