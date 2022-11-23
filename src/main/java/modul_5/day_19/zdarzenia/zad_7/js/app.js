window.addEventListener('resize', () => {
    document.querySelector('#windowWidth').innerHTML = window.innerWidth + 'px';
    document.querySelector('#windowHeight').innerHTML = window.innerHeight + 'px';
})