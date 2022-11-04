function getEvenAverage(array) {
  let resArr = array.filter(function(elem, idx, arr) {
    return elem % 2 === 0;
  });

 	if(resArr.length > 0) {
    let sum = resArr.reduce(function(t, el) {
  		return t + el;
  	});
    console.log(sum / resArr.length);
  } else {
    console.log(null);
  }
}

getEvenAverage([1,2,3,4,5,6,7]);
getEvenAverage([1,1,1,1]);
getEvenAverage([2,8,3,7,4]);