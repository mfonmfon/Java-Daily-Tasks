
function reverse(){
    //let firstArrays = []
    let lastArrays = ['semicolon']
    let temp = ""
    for(let index = 0; index < lastArrays.length; index++){
        for(let secondIndex = 0; secondIndex < lastArrays.length; secondIndex-1){
            temp = lastArrays[index]
            lastArrays[index] = lastArrays[secondIndex]
            lastArrays[secondIndex] = temp
        }
    }
   return lastArrays
}
reverse()