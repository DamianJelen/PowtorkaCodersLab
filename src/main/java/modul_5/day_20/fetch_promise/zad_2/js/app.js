const ulEl = document.querySelector('ul');

fetch('https://pokeapi.co/api/v2/pokemon')
    .then((res) => res.json())
    .then((pokemon) => {
        pokemon.results.forEach((pok) => {
            const liEl = document.createElement('li');
            liEl.innerHTML = pok.name;
            ulEl.appendChild(liEl);
        })
    });