const btnRem = document.querySelector('button#remove');

btnRem.addEventListener('click', () => {
    let ulList = document.querySelector('ul#list');
    ulList.querySelectorAll('li').forEach(li => li.remove());
})