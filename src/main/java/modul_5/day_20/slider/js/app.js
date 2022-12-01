const childrenUlEl = document.querySelectorAll('ul li');
// childrenUlEl.forEach(child => child.classList.add('visible'))

const btnPrev = document.querySelector('#prevPicture');
const btnNext = document.querySelector('#nextPicture');
let imgIdx = 0;

childrenUlEl[0].classList.add('visible');

btnPrev.addEventListener('click', () => {
    if (imgIdx > 0) {
        childrenUlEl[imgIdx].classList.remove('visible');
        imgIdx--;
        childrenUlEl[imgIdx].classList.add('visible');
    } else {
        childrenUlEl[imgIdx].classList.remove('visible');
        imgIdx = childrenUlEl.length - 1;
        childrenUlEl[imgIdx].classList.add('visible');
    }
})

btnNext.addEventListener('click', () => {
    if (imgIdx < childrenUlEl.length - 1) {
        childrenUlEl[imgIdx].classList.remove('visible');
        imgIdx++;
        childrenUlEl[imgIdx].classList.add('visible');
    } else {
        childrenUlEl[imgIdx].classList.remove('visible');
        imgIdx = 0;
        childrenUlEl[imgIdx].classList.add('visible');
    }
})