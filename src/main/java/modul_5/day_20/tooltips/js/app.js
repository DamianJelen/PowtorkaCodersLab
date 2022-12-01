/*
 <span class="tooltipText">Text tooltipa</span>
 */
const allSpanEl = document.querySelectorAll('span.tooltip');

allSpanEl.forEach(spanEl => {
    spanEl.addEventListener('mouseover', () => {
        const newSpanTooltipTex = document.createElement('span');
        newSpanTooltipTex.classList.add('tooltipText');
        newSpanTooltipTex.innerHTML = spanEl.dataset.text;
        spanEl.appendChild(newSpanTooltipTex);
    })

    spanEl.addEventListener('mouseout', () => {
        spanEl.firstElementChild.remove();
    })
})