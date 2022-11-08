function getNumber(num, arrNum) {
  for(let number of arrNum) {
    if(number == num) {
      return true;
    }
  }
  return false;
}

getNumber(2, [33, 54, 2, 1, 4, 100]);
getNumber(5, [33, 54, 2, 1, 4, 100]);