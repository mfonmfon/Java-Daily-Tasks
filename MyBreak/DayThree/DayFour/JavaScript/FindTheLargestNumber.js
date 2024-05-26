const prompt = require("prompt-sync")()

function findLargestNumber(){
  let counter = 0
  let largestNumber = 0
  while(counter < 10){
    let userInput = prompt("Enter a number: ")
    if(laargestNumber < userInput){
      largestNumber = userInput
    }
    counter += 1
}
console.log("The largest number is " + largestNumber)
}