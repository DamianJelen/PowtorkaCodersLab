/*
 <div class="fullScreen">
   <img src="./images/wrong.png">
   <button class="close">Close</button>
 </div>
*/

const childrenULEl = document.querySelectorAll('ul li');
const bodyEl = document.querySelector('body');

childrenULEl.forEach(child => {
    child.addEventListener('click', () => {
        const imgSrc = child.firstElementChild.getAttribute('src');
        const newDiv = document.createElement('div');
        newDiv.classList.add('fullScreen');
        const newImg = document.createElement('img');
        newImg.setAttribute('src', imgSrc);
        const newBtnClose = document.createElement('button');
        newBtnClose.classList.add('close');
        newBtnClose.innerHTML = 'Close';

        newDiv.appendChild(newImg);
        newDiv.appendChild(newBtnClose);
        bodyEl.appendChild(newDiv);

        newBtnClose.addEventListener('click', () => {
            newDiv.remove();
        })
    })
})