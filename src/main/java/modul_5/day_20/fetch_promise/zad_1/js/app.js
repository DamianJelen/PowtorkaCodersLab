const form = document.querySelector('form');
const isbn = document.querySelector('input.form-control');
const bookInfo = document.querySelector('.book-info');


form.addEventListener('submit', (event) => {
    event.preventDefault();
    const isbnVal = isbn.value
    fetch('https://www.googleapis.com/books/v1/volumes?q=isbn:' + isbnVal)
        // .then((response) => console.log(response.text()));
        .then((response) => response.json())
        .then((data) => {
            if(data.totalItems > 0) {
                for (let i = 0; i < data.totalItems; i++) {
                    const newTitle = document.createElement('h2');
                    newTitle.innerHTML = data.items[i].volumeInfo.title;
                    bookInfo.appendChild(newTitle);
                }
            } else {
                const errTitle = document.createElement('h2');
                errTitle.innerHTML = 'Książka o numerze ISBN ' + isbnVal + ' nie istnieje!';
                bookInfo.appendChild(errTitle);
            }
            console.log(data);
        });
})