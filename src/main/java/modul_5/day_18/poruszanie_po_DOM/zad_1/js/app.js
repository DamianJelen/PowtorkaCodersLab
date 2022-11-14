const elemClassFist = document.querySelector(".first").children;
console.log(elemClassFist[0])
console.log(elemClassFist[2])

const elemIdSecond = document.querySelector("#second").parentElement;
const fourthChildOfParent = elemIdSecond.children[3];
console.log(fourthChildOfParent);

const elemEx = document.querySelector('[data-ex="third"]').parentElement;
const ulChildren = elemEx.parentElement.lastElementChild.firstElementChild.children;
console.log(ulChildren.item(Math.floor((ulChildren.length - 1)/2)));

const divFourth = document.querySelector("div.forth").parentElement.getElementsByTagName("article").item(0);
const secondChild = divFourth.getElementsByTagName("p").item(1);
console.log(secondChild);