function addTheSameNumbers(num, arrNum) {
    let result = 0;

    if(!arrNum.includes(num)) {
        return null;
    }

    for(let number of arrNum) {
        if(number == num) {
            result += num;
        }
    }

    return result;
}


addTheSameNumbers(7, [4, 7, 24, 7, 0, 10]);
addTheSameNumbers(9, [33, 54, 2, 1, 9, 100]);
addTheSameNumbers(0, [33, 0, 2, 0, 9, 0]);
addTheSameNumbers(43, [6, 0, 2, 2, 3, 46]);