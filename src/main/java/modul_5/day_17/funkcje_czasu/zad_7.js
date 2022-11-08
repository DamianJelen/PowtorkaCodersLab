function getMissingElement(arrSortNum) {
    for(let i = 1; i < arrSortNum.length; i++) {
        if(Math.abs(arrSortNum[i] - arrSortNum[i - 1]) != 1) {
            return arrSortNum[i] - 1;
        }
    }
    return null;
}

getMissingElement([1,2,3,4,5,6,7]);
getMissingElement([6,7,8,10,11,12,13,14,15]);
getMissingElement([-4,-3,-2,0,1,2,3,4]);