const newSelectEl = document.createElement('select');
newSelectEl.setAttribute('id', 'country');
const country = ['PL', 'GB', 'US'];
country.forEach(c => {
    const newOptionEl = document.createElement('option');
    newOptionEl.setAttribute('value', c);
    newOptionEl.innerHTML = c;
    newSelectEl.appendChild(newOptionEl);
})
const bodyEl = document.getElementsByTagName('body')[0];
const divAppEl = document.querySelector('div#app');

bodyEl.insertBefore(newSelectEl, divAppEl);

let newUlEl = document.createElement('ul');
newUlEl.setAttribute('id', 'holidays');
divAppEl.appendChild(newUlEl);
let ulEl = document.querySelector('ul#holidays');

let selectedOption = country[0];
const optionSelectEl = document.querySelectorAll("select#country option");


function writeHolidaysList(selectedCountry) {
    fetch('https://fer-api.coderslab.pl/v1/holidays?key=e92601251-c0a2-4s63-v73f-54041195480f&country=' + selectedCountry)
        .then((response) => response.json())
        .then((holiday) => {
            holiday.holidays.forEach(hol => addHolidayToUl(hol.date + ': ' + hol.name));
        });
}
writeHolidaysList(selectedOption);

function addHolidayToUl(addHol) {
    const newLiEl = document.createElement('li');
    newLiEl.innerHTML = addHol;
    ulEl.appendChild(newLiEl);
}

optionSelectEl.forEach(option => {
    option.addEventListener('click', () => {
        if (option.selected) {
            selectedOption = option.value;
            ulEl.remove();
            newUlEl = document.createElement('ul');
            newUlEl.setAttribute('id', 'holidays');
            divAppEl.appendChild(newUlEl);
            ulEl = document.querySelector('ul#holidays');
            // console.log(ulEl);
            writeHolidaysList(selectedOption);
        }
    })
})