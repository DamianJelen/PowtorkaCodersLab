const numberArr = [1, 2, 3];

function addAllElemArr(arr) {
    let result = 0;
    for (let i = 0; i < arr.length; i++) {
        result += arr[i];
    }
    return result;
}

console.log(addAllElemArr(numberArr));

let maxNumber = function(a, b, c) {
    if(a >= b && a >= c) {
        return a;
    } else if(b >= a && b >= c) {
        return b;
    } else {
        return c;
    }
}

console.log(maxNumber(3,9, 1));

function calculateTip(amount, rating) {
    switch (rating) {
        case "Bardzo dobra obsługa": {
            return (amount * 0.25).toFixed(2);
        }
        case "Dobra obsługa": {
            return (amount * 0.2).toFixed(2);
        }
        case "Średnia obsługa": {
            return (amount * 0.15).toFixed(2);
        }
        case "Zła obsługa": {
            return 0;
        }
        default: {
            return 0;
        }
    }
}

console.log(calculateTip(prompt("Kwota do zapłaty:"), prompt("Ocena obłsługi:")));