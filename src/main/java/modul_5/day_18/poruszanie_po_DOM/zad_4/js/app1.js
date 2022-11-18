const childDiv = document.querySelectorAll("div.listContainer"); ;
for (let i = 0; i < childDiv.length; i++) {
    childDiv[i].addEventListener("mouseover", function(event) {
        let elem = this.querySelectorAll("li.list-group-item");
        for (let j = 0; j < elem.length; j++) {
            if (j == 0) {
                elem[j].setAttribute("style", "background-color: red")
            } else if (j == elem.length - 1) {
                elem[j].setAttribute("style", "background-color: blue")
            } else {
                elem[j].setAttribute("style", "background-color: green")
            }
        }
    })
}
