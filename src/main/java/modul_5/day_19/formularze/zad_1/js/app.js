const emailInput = document.querySelector('#email');
const nameInput = document.querySelector('#name');
const surnameInput = document.querySelector('#surname');
const pass1Input = document.querySelector('#pass1');
const pass2Input = document.querySelector('#pass2');
const agreeCheckbox = document.querySelector('#agree');
const form = document.querySelector('form');
const successContainer = document.querySelector('#success-message');
const errorContainer = document.querySelector('#error-message');
form.addEventListener('submit', function (event) {
    const email = emailInput.value;
    const name = nameInput.value;
    const surname = surnameInput.value;
    const pass1 = pass1Input.value;
    const pass2 = pass2Input.value;
    const agree = agreeCheckbox.checked;
    const errors = [];
    successContainer.classList.add('d-none');
    errorContainer.classList.add('d-none');
    if (!email.includes('@')) errors.push('Email musi posiadać znak @');
    if (name.length <= 2) errors.push('Twoje imię jest za krótkie');
    if (surname.length <= 2) errors.push('Twoje nazwisko jest za krótkie');
    if (pass1 !== pass2 || !pass1)
        errors.push('Hasła nie są takie same lub puste');
    if (!agree) errors.push('Musisz zaakceptować warunki');
    if (errors.length > 0) {
        errorContainer.classList.remove('d-none');
        errorContainer.innerHTML = errors.join('<br/>');
    } else {
        successContainer.classList.remove('d-none');
        successContainer.innerText = 'Formularz wysłany!';
    }
    event.preventDefault();
});