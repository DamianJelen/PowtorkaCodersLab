function showThisElem(idElement) {
    const square = document.querySelector("a#"+idElement).previousElementSibling;
    if (square.getAttribute("style") == "visibility: hidden") {
        square.setAttribute("style", "visibility: visible");
    } else {
        square.setAttribute("style", "visibility: hidden");
    }
}