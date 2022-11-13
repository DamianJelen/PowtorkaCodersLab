const ul = document.querySelector(".exercise").querySelector("ul");
ul.classList.add("menu");

const li = ul.children;
for (let i = 0; i < li.length; i++) {
    li[i].classList.remove("error");
    li[i].classList.add("menuElement");
    li[i].dataset.id = (i + 1);
}