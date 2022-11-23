const buttons = document.querySelectorAll(".btn");
for (let i = 0; i < buttons.length; i++) {
    buttons[i].addEventListener("click", function() {
        let licznik = document.querySelector("h2 span.counter").innerHTML.valueOf();
        licznik = parseInt(licznik) + 1;
        document.querySelector("h2 span.counter").innerHTML = licznik;
    })
}