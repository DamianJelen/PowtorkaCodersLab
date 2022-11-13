const firstArticle = document.querySelector('article.first');
console.log(firstArticle);

const headers = firstArticle.getElementsByTagName('h2');
console.log(headers.length);


const tagArtFirst = document.querySelector("article.first");
console.log(tagArtFirst);

const tagArtFirstH2 = document.querySelectorAll("article.first h2");
console.log(tagArtFirstH2.length);
