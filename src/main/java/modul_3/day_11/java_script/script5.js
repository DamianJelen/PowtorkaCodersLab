const randomNumbers = [];

for (let i = 0; i < 10; i++) {
    randomNumbers.push((Math.random() * 60 + 1).toFixed(0));
    randomNumbers[i] = parseInt(randomNumbers[i]);
}
console.log(randomNumbers);

for (let i = 0; i < randomNumbers.length; i++) {
    if(randomNumbers[i] % 2 != 0 && randomNumbers[i] === 1) {
        randomNumbers[i] += 1;
    } else if(randomNumbers[i] % 2 != 0 && randomNumbers[i] < 60) {
        randomNumbers[i] -= 1;
    }
    randomNumbers[i] = parseInt(randomNumbers[i]);
}
console.log(randomNumbers);