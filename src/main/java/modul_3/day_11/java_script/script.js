let zmienna1 = "Hello";
let zmienna2 = "JS";
const wypisz = zmienna1 + " " + zmienna2;
console.log(wypisz);

let zm1 = 2;
let zm2 = "dwa";
let zm3 = zm1 + zm2;
let zm4 = false;
let zm5;

console.log(zm1 + ": " + typeof zm1);
console.log(zm2 + ": " + typeof zm2);
console.log(zm3 + ": " + typeof zm3);
console.log(zm4 + ": " + typeof zm4);
console.log(zm5 + ": " + typeof zm5);

let imiona = ["Jan", "Maria", "Kasia", "Wojtek", "Zosia"];
console.log(imiona[1]);
console.log(imiona[4]);
console.log(imiona.length);

let imiona2 = [];
imiona2.push("Jan", "Maria", "Kasia", "Wojtek", "Zosia", "Grzesiek")
console.log(imiona2);

let array2D = [
    [1,2,3,4],
    [5,6,7,8],
    [9,10,11,12]
]

console.log(array2D[0][1]);
console.log(array2D[1]);
console.log(array2D.length);

let mixedArray2D = [];
mixedArray2D.push(["Maria", "Jan", "Piotr"], [1, 2, 3, 4, 5, 6]);
console.log(mixedArray2D[0][2]);
console.log(mixedArray2D[1][4]);
console.log(mixedArray2D[1].length);