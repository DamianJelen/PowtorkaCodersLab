const divBox = document.querySelectorAll('.box');

function changeColor(event) {
    const randomColor = "#" + Math.floor(Math.random()*16777215).toString(16);
    this.setAttribute('style', 'background-color:' + randomColor)
}

for (let i = 0; i < divBox.length; i++) {
    divBox[i].addEventListener('click', changeColor);
}