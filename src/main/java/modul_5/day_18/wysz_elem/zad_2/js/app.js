const divs = document.getElementsByTagName('div');
console.log('Jest', divs.length, 'elementów div');

const offers = document.getElementsByClassName('offers');
console.log('Jest', offers.length, 'elementów o klasie offers');

const withAttribute = document.querySelectorAll('[href]');
console.log('Jest', withAttribute.length, 'elementów o z atrybutem href');
