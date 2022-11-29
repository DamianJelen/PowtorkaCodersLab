const pToPay = document.querySelector('p span.badge-primary');
let total = parseFloat(pToPay.innerHTML);

const pOrderInfo = document.querySelector('p.order-info');
const checkBox = document.querySelectorAll('input.form-check-input');

const btnAddAllAcc = document.querySelector('div.btn-group').firstElementChild;
const btnClearAcc = btnAddAllAcc.nextElementSibling;
const btnOrder = document.querySelector('button.float-right');

const form = document.querySelector('form');

form.reset();

btnAddAllAcc.addEventListener('click', function(event) {
    let sum = 0;
    checkBox.forEach(chb => {
        chb.checked = true;
        sum += parseFloat(chb.dataset.price);
    })
    pToPay.innerHTML = Math.round((sum * 100))/100 + ' zł';
    total = parseFloat(pToPay.innerHTML);
})

btnClearAcc.addEventListener('click', function(event) {
    btnAddAllAcc.classList.remove('d-none');
    pOrderInfo.innerHTML = '';
    checkBox.forEach(chb => {
        chb.checked = false;
    })
    pToPay.innerHTML = '0 zł';
    total = parseFloat(pToPay.innerHTML);
})

btnOrder.addEventListener('click', function (event) {
    btnAddAllAcc.classList.add('d-none');
    pOrderInfo.innerHTML = 'Do zapłaty: ' + total + ' zł';
    event.preventDefault();
})

checkBox.forEach(chb => {
    chb.addEventListener('change', function (event) {
        if (chb.checked) {
            total += parseFloat(chb.dataset.price);
            pToPay.innerHTML = Math.round((total * 100))/100 + ' zł';
        } else {
            console.log('del');
            total -= parseFloat(chb.dataset.price);
            pToPay.innerHTML = Math.round((total * 100))/100 + ' zł';

        }
    })
})