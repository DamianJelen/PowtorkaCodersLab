// 1
const idMenu = document.querySelector("#menu").children;

function getDataInfo(elem) {
    let result = [];
    console.log(elem);
    for (let i = 0; i < elem.length; i++) {
        result.push(elem[i].dataset.info);
    }
    return result;
}

console.log(getDataInfo(idMenu));

// 2
const idMainContainer = document.querySelector("#main-container");
function getElementClass(elem) {
    return elem.classList;
}
console.log(getElementClass(idMainContainer));

// 3
const elemByClass = document.querySelector(".pink-color");
function getElementText(elem) {
    return elem.innerText;
}
console.log(getElementText(elemByClass));

// 4
const elemImg = document.querySelectorAll(".images");
function getElementAlt(elem) {
    let result = [];
    for (let i = 0; i < elem.length; i++) {
        result.push(elem[i].getAttribute("alt"));
    }
    return result;
}
console.log(getElementAlt(elemImg));

// 5
const elemMyLink = document.querySelectorAll(".my-link");
function getElementHref(elem) {
    let result = [];
    for (let i = 0; i < elem.length; i++) {
        result.push(elem[i].getAttribute("href"));
    }
    return result;
}
console.log(getElementHref(elemMyLink));