function factors(num) {
    let resArr = [];

    if(num <= 0) {
        return resArr;
    }

    for(let i = num; i > 0; i--) {
        if(num % i == 0) {
            resArr.push(i);
        }
    }
    return resArr;
}

factors(2);
factors(54);
factors(-4);