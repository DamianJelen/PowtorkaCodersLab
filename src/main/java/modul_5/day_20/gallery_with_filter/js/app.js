const imgsEl = document.querySelectorAll('img');
const btnHide = document.querySelector('button#hideButton');
const btnShow = document.querySelector('button#showButton');
const inputEl = document.querySelector('input#tagInput');

btnHide.addEventListener('click', () => {
    imgsEl.forEach(image => {
        showHideImage(image, inputEl.value);
    })
})

btnShow.addEventListener('click', () => {
    imgsEl.forEach(image => {
        showHideImage(image, inputEl.value, 0);
    })
})

function showHideImage(image, inputVal, hide=1) {
    if (image.dataset.tag.indexOf(inputVal) >= 0) {
        if (hide === 1) {
            image.style.visibility = 'hidden';
        } else {
            image.style.visibility = 'visible';
        }
    }
}
