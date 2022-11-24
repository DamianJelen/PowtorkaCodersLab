const buttons = document.querySelectorAll('.deleteBtn');

function deleteRow(event) {
    this.parentElement.parentElement.remove()
}

for (let i = 0; i < buttons.length; i++) {
    buttons[i].addEventListener('click', deleteRow);
}