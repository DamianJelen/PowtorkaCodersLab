const btnPrimary = document.querySelector('a.btn-primary');
const btnSuccess = document.querySelector('a.btn-success');

btnPrimary.addEventListener('click', function (event) {
    this.nextElementSibling.classList.remove('d-none');
})

btnSuccess.addEventListener('mouseover', function(event) {
    this.nextElementSibling.classList.remove('d-none');
})

btnSuccess.addEventListener('mouseout', function (event) {
    this.nextElementSibling.classList.add('d-none');
})