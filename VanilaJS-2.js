const PageWidth = document.querySelector("h1");
const Colorof = {
  Back: function (thiscolor) {
    document.body.style.backgroundColor = thiscolor;
  }
};

const Changed = {
  Resized: function () {
    PageWidth.innerText = "Width of this page is " + String(innerWidth) + " px";
    if (innerWidth > 1024) {
      Colorof.Back("lavender");
    } else if (innerWidth > 512) {
      Colorof.Back("powderblue");
    } else {
      Colorof.Back("Darkseagreen");
    }
  }
};

window.addEventListener("resize", Changed.Resized);
