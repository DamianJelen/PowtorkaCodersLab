function changeColor(elem) {
    const randomColor = "#" + Math.floor(Math.random()*16777215).toString(16);
    const parentBtn = document.querySelector("a#" + elem).parentElement;
    parentBtn.setAttribute("style", "background-color: " + randomColor);
}