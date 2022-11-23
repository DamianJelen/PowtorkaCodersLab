const divBox = document.querySelector('#box');
let globalX = document.querySelector('#globalX');
let globalY = document.querySelector('#globalY');
let localX = document.querySelector('#localX');
let localY = document.querySelector('#localY');

divBox.addEventListener('mousemove', (event) => {
    globalX.innerHTML = event.clientX;
    globalY.innerHTML = event.clientY;
    localX.innerHTML = event.offsetX;
    localY.innerHTML = event.offsetY;
})