const clock = document.querySelector("h2.js-clock");

function time() {
  const ADay = 1000 * 60 * 60 * 24;
  const ChristmasDate = new Date("2023, 12, 25");
  const Nowdate = new Date();
  const RemainingDate = new Date(
    ChristmasDate.getTime() -
      Nowdate.getTime() +
      +Nowdate.getTimezoneOffset() * 60 * 1000
  );
  const RemainingD = Math.trunc(RemainingDate / ADay);
  const RemainingH = String(RemainingDate.getHours()).padStart(2, "0");
  const RemainingM = String(RemainingDate.getMinutes()).padStart(2, "0");
  const RemainingS = String(RemainingDate.getSeconds()).padStart(2, "0");
  clock.innerText = `${RemainingD}d ${RemainingH}h ${RemainingM}m ${RemainingS}s`;
}
setInterval(time, 1000);
