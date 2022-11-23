const parentEl = document.querySelectorAll("div.parent");
for (let i = 0; i < parentEl.length; i++) {
    parentEl[i].addEventListener("mouseenter", function() {
        let firstChild = this.firstElementChild;
        firstChild.setAttribute("style", "display: inherit");
        firstChild.addEventListener("mouseleave", function () {
            firstChild.setAttribute("style", "display: none");
        })
    })
}