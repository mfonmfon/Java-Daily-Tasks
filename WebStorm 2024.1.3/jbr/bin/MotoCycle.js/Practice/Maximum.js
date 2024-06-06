function findMax(numbers){
    let  maximum = 0
    for(let index = 0; index < numbers.length; index++){
        if(numbers[index] > maximum){
            maximum = numbers[index]
        }
    }
}
findMax()