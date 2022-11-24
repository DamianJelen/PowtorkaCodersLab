const btnToDel = document.querySelector('.btn');
btnToDel.addEventListener('click', () => {
    btnToDel.parentElement.remove();
})