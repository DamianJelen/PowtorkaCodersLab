const imgEl = document.querySelectorAll('img');
const selectOptions = document.querySelectorAll('select.form-control option');
const btnAcc = document.querySelector('button.btn-primary');
const form = document.querySelector('form');
selectOptions.forEach(selOpt => {
    if (!selOpt.selected) {
        imgEl[selOpt.index].classList.add('d-none');
    } else {
        imgEl[selOpt.index].classList.remove('d-none');
    }
})

btnAcc.addEventListener('click', function (event) {
    event.preventDefault();
    selectOptions.forEach(selOpt => {
        if (!selOpt.selected) {
            imgEl[selOpt.index].classList.add('d-none');
        } else {
            imgEl[selOpt.index].classList.remove('d-none');
        }
    })
});