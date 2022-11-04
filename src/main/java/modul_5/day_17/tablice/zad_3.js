var owoce = ["gruszka", "sliwka", "pomarancza", "banan"];

function printTable(array) {
    for(let i = 0; i < array.length; i++) {
      console.log(array[i]);
    }
}

function printTable(array) {
    array.forEach(elem => console.log(elem));
}

printTable(owoce);