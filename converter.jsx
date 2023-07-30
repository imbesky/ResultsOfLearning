import React from 'react'
import ReactDOM from 'react-dom/client'

function App(){
  const [sec, setSec] = React.useState(0);
  const [hour, setHour] = React.useState(0);
  const [min, setMin] = React.useState(0);
  const onChange = (submit) => {
    const s = submit.target.value;
    setSec(s);
    setHour(s/3600);
    setMin(s/60);
  }
  const onChange2 = (submit) => {
    const h = submit.target.value;
    setHour(h);
    setSec(h*3600);
    setMin(h*60);
  }
  const onChange3 = (submit) => {
    const m = submit.target.value;
    setMin(m);
    setSec(m*60);
    setHour(m/60);
  }
  return (
    <div>
    <h1>Seconds to Hours Converter</h1>
      <div>
    <label htmlFor="seconds">Seconds</label>
    <input onChange={onChange} type="number" id="second" placeholder="Seconds"></input>
    </div>
    <div>
    <label htmlFor="minutes">Minutes</label>
    <input onChange={onChange3} type="number" id="minute" placeholder="Minutes"></input>
    </div>
    <div>
    <label htmlFor="hours">Hours</label>
    <input onChange={onChange2} type="number" id="hour" placeholder="Hours"></input>
    </div>
    <h2>{sec} seconds = {min} minutes = {hour} hours</h2>
    <div>
      <button onClick={resest}>Reset</button>
      <button onClick={clicked}></button>
    </div>
    </div>
  );
}

ReactDOM.createRoot(document.getElementById("root")).render(<App/>);
