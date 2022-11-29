const elForm = document.querySelector('form');
const elBtn = document.querySelector('button');
const elTeam1 = document.querySelector('#team1');
const elTeam2 = document.querySelector('#team2');
const elPointsTeam1 = document.querySelector('#points1');
const elPointsTeam2 = document.querySelector('#points2');
elBtn.addEventListener('click', function(event) {
    let lastTr = document.querySelector('tbody').lastElementChild;
    event.preventDefault()

    console.log(elTeam1.value, elTeam2.value, elPointsTeam1.value, elPointsTeam2.value);

    if (elTeam1.value != elTeam2.value &&
        elPointsTeam1.value >= 0 &&
        elPointsTeam2.value >= 0) {
        let result = elPointsTeam1.value + ' - ' + elPointsTeam2.value;
        let newTr = lastTr.cloneNode(true);
        newTr.querySelectorAll('td')[0].innerHTML = elTeam1.value;
        newTr.querySelectorAll('td')[1].innerHTML = elTeam2.value;
        newTr.querySelectorAll('td')[2].innerHTML = result;
        lastTr.parentElement.appendChild(newTr);
    }
})