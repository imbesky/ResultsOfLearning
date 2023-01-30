const RangeForm = document.querySelector("#range");
const RangeInput = document.querySelector("#range input");
const GuessForm = document.querySelector("#guess");
const GuessInput = document.querySelector("#guess input");

const info1 = document.querySelector("#info1");
const info2 = document.querySelector("#info2");
const Right = document.querySelector("#right");
const Wrong = document.querySelector("#wrong");
const Restart = document.querySelector("#restart");

const ClassHide = "hidden";

const RangeKey = "MaxNumber";
const SavedRange = localStorage.getItem(RangeKey);


function restartgame(){
    window.localStorage.clear();
    location.reload(true);
}

function Showresult(g,r){ 
    if (g==r)
    {Right.classList.remove(ClassHide);
     Wrong.classList.add(ClassHide);}
    else 
    {Wrong.classList.remove(ClassHide);
     Right.classList.add(ClassHide);}
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
    } else if (GuessInput.value === undefined || GuessInput.value === null) {
    alert("Guess the number first.");
    } else {
    const SelectedGuess = GuessInput.value;
    info1.innerHTML = `You selected ${SelectedGuess}`;
    const randomnumber = Math.round(Math.random() * SavedRange);
    info2.innerHTML = `Coumputer selected ${randomnumber}`;
    Showresult(SelectedGuess,randomnumber);}
    }

RangeForm.addEventListener("submit", RangeSubmit);
GuessForm.addEventListener("submit", GuessSubmit);
Restart.addEventListener("click", restartgame)
