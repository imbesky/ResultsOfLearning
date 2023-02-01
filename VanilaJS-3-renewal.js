const RangeForm = document.querySelector("#range");
const RangeInput = document.querySelector("#range input");
const GuessForm = document.querySelector("#guess");
const GuessInput = document.querySelector("#guess input");

const Result = document.querySelector("#result")
const Restart = document.querySelector("#restart");

const RangeKey = "MaxNumber";
const SavedRange = localStorage.getItem(RangeKey);

function restartgame(){
    window.localStorage.clear();
    location.reload(true);
}

function RangeSubmit(refresh)
{refresh.preventDefault();
const SelectedRange = RangeInput.value;
localStorage.setItem(RangeKey, SelectedRange);
location.reload(true);
}

function GuessSubmit(refresh){
    refresh.preventDefault();
    if(SavedRange===null){
        alert("Please generate a range first.")
    } else if(SavedRange < GuessInput.value) {
        alert("Your number is too big!")
    } else {
    const SelectedGuess = parseInt(GuessInput.value, 10);
    const randomnumber = Math.round(Math.random() * SavedRange);
    Result.innerHTML = `
    Your selected ${SelectedGuess}
    Computer selected ${randomnumber}
    ${SelectedGuess === randomnumber ? "You are right!" : "You are wrong!"}
    `;}
    }

RangeForm.addEventListener("submit", RangeSubmit);
GuessForm.addEventListener("submit", GuessSubmit);
Restart.addEventListener("click", restartgame)
