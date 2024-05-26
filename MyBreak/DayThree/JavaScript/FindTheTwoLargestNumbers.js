

function FindTheTWOLargestNumbers(){
  
  let temp = 0
  let arr = []
  let size = arr.length; 

  for (let i = 0; i <  size; i++){

    let value = prompt("Enter a number between  ")
    for(let j = 0; j < size+1; j++){

      if(arr[j] > arr[i]){
        temp = arr[j]
        arr[j] = arr[i]
        arr[i] = temp

        
      }
    }
  }
}