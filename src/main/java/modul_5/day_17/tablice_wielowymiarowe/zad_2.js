var array2d = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

function print2DArray(arr) {
    for (let i = 0; i < arr.length; i++) {
        for(let j = 0; j < arr[i].length; j++) {
            console.log(arr[i][j]);
        }
    }
}

print2DArray(array2d);