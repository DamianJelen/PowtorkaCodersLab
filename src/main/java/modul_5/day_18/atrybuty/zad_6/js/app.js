const banner = document.querySelector(".ban");

function getClassInfo(elem) {
    let arrOfElClass = [];
    for (let i = 0; i < elem.classList.length; i++) {
        arrOfElClass.push(elem.classList[i]);
    }
    return arrOfElClass;
}

console.log(getClassInfo(banner));