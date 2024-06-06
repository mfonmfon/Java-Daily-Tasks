const findArrays =(arrays, numbers)=>{
    if(arrays == null){
        return void 0
    }
    if(numbers == null){
        return arrays[arrays.length - 1]
    }
    return arrays.slice(Math.max(arrays.length -  numbers, 0))
}
console.log(findArrays([1,2,3,4,5,-2]))