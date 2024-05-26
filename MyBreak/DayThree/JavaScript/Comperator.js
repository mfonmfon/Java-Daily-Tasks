const prompt = require('prompt-sync')()

function createComperator(){
let  firstNumber = prompt("Enter first number ")
let secondNumber = prompt("Enter second number ")

if(firstNumber == secondNumber){
  console.log("0")
}
else if(firstNumber > secondNumber){
  console.log("1")
}
else if(secondNumber > firstNumber){
  console.log("-1")
}
}
createComperator()