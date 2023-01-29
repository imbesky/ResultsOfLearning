const colors = ["#1abc9c", "#3498db", "#9b59b6", "#f39c12", "#e74c3c"];
const superEventHandler = {
  entered: function () {
    h2.innerText = "Mouse entered NOW!";
    h2.style.color = colors[0];
  },
  leaved: function () {
    h2.innerText = "OMG! Mouse leaved.";
    h2.style.color = colors[2];
  },
  resized: function () {
    h2.innerText = "Resizing is a good idea.";
    h2.style.color = colors[4];
  },
  rightcliked: function () {
    h2.innerText = "You are clicking RIGHT!";
    h2.style.color = colors[3];
  },
  fullscreen: function () {
    document.body.style.backgroundColor = colors[1];
  },
  copied: function () {
    alert("Don't copy please!");
  },
  clicked: function () {
    h2.innerText = "Did you clicked me?";
    h2.style.color = colors[1];
  },
  dbclicked: function () {
    h2.innerText = "Coool your clicking is fast.";
    h2.style.color = colors[0];
  }
};

const h2 = document.querySelector("h2");
h2.addEventListener("mouseenter", superEventHandler.entered);
h2.addEventListener("mouseleave", superEventHandler.leaved);
window.addEventListener("contextmenu", superEventHandler.rightcliked);
window.addEventListener("resize", superEventHandler.resized);
window.addEventListener("fullscreenchange", superEventHandler.fullscreen);
window.addEventListener("copy", superEventHandler.copied);
h2.addEventListener("click", superEventHandler.clicked);
h2.addEventListener("dblclick", superEventHandler.dbclicked);
