const childDiv = document.querySelector("div.listContainer").firstElementChild;

childDiv.addEventListener("onmouseenter", (event) => {
    console.log(event.currentTarget);
})
