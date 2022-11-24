const elemUl = document.querySelector('ul#menu');

document.querySelector('button#add').addEventListener('click', () => {
    let liczElLi = parseInt(elemUl.querySelectorAll('li').length);
    let tekst = 'Element ' + (liczElLi + 1) + ' - w chwili dodania było ' + liczElLi + ' elementów';
    let newLi = elemUl.lastElementChild.cloneNode(true);
    newLi.innerHTML = tekst;
    elemUl.appendChild(newLi);
})
