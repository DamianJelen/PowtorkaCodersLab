let divList1 = document.querySelector('div#list1');
let divList2 = document.querySelector('div#list2');

let elementsA = document.querySelectorAll('a.list-group-item.list-group-item-action');
// console.log(elementsA);

for (let i = 0; i < elementsA.length; i++) {
    elementsA[i].addEventListener('click', function(event) {
        // let cloneElem = elementsA[i].cloneNode(true);


        if (elementsA[i].parentElement.id === 'list1') {
            divList2.appendChild(elementsA[i]);
        } else if (elementsA[i].parentElement.id === 'list2') {
            divList1.appendChild(elementsA[i]);
        }
    })
}