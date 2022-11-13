const home = document.getElementById("home");
const children = document.querySelector(".offers").querySelectorAll("div, h2, p");
const ban = document.querySelector(".ban");
const someBlocks = document.querySelectorAll(".block");
const listElements = document.querySelector(".links").querySelectorAll("li");


// typeof
function wypisz(zmienna) {
    for(let i = 0; i < zmienna.length; i++) {
        console.log(zmienna[i].tagName, zmienna[i].className);
    }
}

console.log(home.tagName, home.className)

wypisz(children);
console.log(ban.tagName, ban.className);
wypisz(someBlocks);
wypisz(listElements);