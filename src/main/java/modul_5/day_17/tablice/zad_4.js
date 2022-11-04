function multiply(array) {
  let mul = array.reduce(function(t, i) {
    return t * i;
  });
  console.log(mul);
}

multiply([1,2,3,4,5,6,7]);
multiply([1,1,1,1]);
multiply([2,8,3,7]);