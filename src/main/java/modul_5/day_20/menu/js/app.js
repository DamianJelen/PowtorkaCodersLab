const firstLevelLiEl = document.querySelector('div.nav ul').childNodes;
firstLevelLiEl.forEach(liEl => {
    liEl.addEventListener('mouseover', () => {
        const ulEl = liEl.firstElementChild;
        if (ulEl !== null) {
            ulEl.style.display = 'list-item';
        }
    })

    liEl.addEventListener('mouseout', () => {
        const ulEl = liEl.firstElementChild;
        if (ulEl !== null) {
            ulEl.style.display = 'none';
        }
    })
})