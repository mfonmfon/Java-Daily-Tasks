
const getAnArraysOfNumbersAndOutputObjects =(arrays)=>{
    let objects = {}
    for(let index = 0; index < arrays.length; index++){
       let  temp = arrays[index];
       if(temp in objects){
           objects[temp] +=1
       }else{
           objects[temp] = 1
       }
     }
    console.log(objects, ": ")
}
getAnArraysOfNumbersAndOutputObjects([2,3,5,3,3,2,5])

