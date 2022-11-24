let lastTr = document.querySelector('tbody').lastElementChild;
const btnAdd = document.querySelector('button#add');

btnAdd.addEventListener('click', () => {
    let nrZam = document.querySelector('input#orderId').value;
    let przedZam = document.querySelector('input#item').value;
    let quanZam = document.querySelector('input#quantity').value;

    let newTr = lastTr.cloneNode(true);
    newTr.querySelectorAll('td')[0].innerHTML = nrZam;
    newTr.querySelectorAll('td')[1].innerHTML = przedZam;
    newTr.querySelectorAll('td')[2].innerHTML = quanZam;

    lastTr.parentElement.appendChild(newTr);
})