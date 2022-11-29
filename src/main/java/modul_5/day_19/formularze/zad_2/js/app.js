const invoiceData = document.querySelector('div#invoiceData');
const checkBox = document.querySelector('input#invoice');

if (checkBox.checked) {
    invoiceData.classList.remove('d-none');
} else {
    invoiceData.classList.add('d-none');
}

const formularz = document.querySelector('form');

formularz.addEventListener('change', function (event) {
    if (checkBox.checked) {
        invoiceData.classList.remove('d-none');
    } else {
        invoiceData.classList.add('d-none');
    }
    event.preventDefault();
})