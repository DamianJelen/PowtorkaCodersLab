function sortArray(arr) {
  return arr.sort(function(a, b) {
    return a - b;
  });
}

sortArray([145,11,3,64,4,6,10]);