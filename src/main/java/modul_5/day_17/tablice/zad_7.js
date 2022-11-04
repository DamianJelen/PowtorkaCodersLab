function addArrays(arr_1, arr_2) {
  let resArr = [];
  if(arr_1.length >= arr2.length) {
    for(let i = 0; i < arr_1.length; i++) {
      resArr.push(arr_1[i] + arr_2[i])
    }
  } else {
    for(let i = 0; i < arr_2.length; i++) {
      resArr.push(arr_1[i] + arr_2[i])
    }
    for(let i)
  }
  return resArr;
}

addArrays([4,0,1,3,4], [1,9,6,7,8,17]);
addArrays([8,3,22], [1,3,2]);
addArrays([2,3,1,5,3,5], [3,1,76,1]);