const clock = document.querySelector("h2#clock");

function time(){
    const ADay = 1000*60*60*24;
    const ChristmasDate = new Date("December 25 2023 00:00:00 GMT+0900");
    const Nowdate = new Date();
    const RemainingDate = 
    new Date(ChristmasDate.getTime() - Nowdate.getTime());
    const RemainingD = Math.trunc(RemainingDate/ADay);
    const RemainingH = String(RemainingDate.getHours()).padStart(2, "0");
    const RemainingM = String(RemainingDate.getMinutes()).padStart(2, "0");
    const RemainingS = String(RemainingDate.getSeconds()).padStart(2, "0");
    clock.innerText = 
    `${RemainingD}d ${RemainingH}h ${RemainingM}m ${RemainingS}s`;
}
setInterval(time, 1000);
