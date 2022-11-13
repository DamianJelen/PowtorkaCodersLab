let element = document.querySelector("main.container").querySelectorAll("header, section, nav, footer");
function getTags(elements) {
    let elementsArr = [];
    for (let i = 0; i < elements.length; i++) {
        elementsArr.push(elements[i].tagName);
    }
    return elementsArr;
}

console.log(getTags(element));