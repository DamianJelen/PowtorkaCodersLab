const section = document.querySelector("section.exercise");
const ul = section.querySelector("ul.list-group");
for (let i = 0; i < ul.children.length; i++) {
    if(i % 2 == 1) {
        ul.children[i].style.backgroundColor = "#9e9e9e";
    }

    if(i == 4) {
        ul.children[i].setAttribute("class", "big");
    }

    if(i % 3 == 0) {
        ul.children[i].style.textDecoration = "underline";
    }
}
