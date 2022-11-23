const buttons = document.querySelectorAll('.btn');
for (let i = 0; i < buttons.length; i++) {
    buttons[i].addEventListener('click', () => {
        let licznik = buttons[i].previousElementSibling.querySelector('span.counter').innerHTML;
        licznik = parseInt(licznik) + 1;
        buttons[i].previousElementSibling.querySelector('span.counter').innerHTML = licznik;
    })
}