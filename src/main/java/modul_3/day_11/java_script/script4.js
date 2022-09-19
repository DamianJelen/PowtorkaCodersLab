const numbers = [4, 4, 1, 2, 5, 40];
let result = 0;
for (let i = 0; i < numbers.length; i++) {
    result += numbers[i];
}

console.log((result / numbers.length).toFixed(3));