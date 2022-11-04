function distFromAverage(arr) {
  var sum = arr.reduce(function(total, item) {
    return total + item;
  });

  var avg = sum / arr.length;
  var resArr = [];
  for(var i = 0; i < arr.length; i++) {
    resArr.push(Math.abs(arr[i] - avg))
  }
  return resArr;
}

distFromAverage([1,2,3,4,5,6,7]);
distFromAverage([1,1,1,1]);
distFromAverage([2,8,3,7]);