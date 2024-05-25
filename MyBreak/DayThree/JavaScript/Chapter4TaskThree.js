const prompt = require("prompt-sync")()

function creditLimitCalculator(){
let newBalance = 0


let accountNumber = prompt("Enter your account number: ")
if(accountNumber > 10 || accountNumber < 10){
  console.log("Please enter a valid account number: ");
}
else{
let beginningBalance = prompt("Enter your balance at the beginning of a new month: ")
let charges = prompt("Enter the charges amount: ")
let creditLimit = prompt("Enter the total credit limit applied to the account this month: ")

newBalance = beginningBalance + charges - creditLimit
}
if(newBalance < 0.0){

  console.log("Credit limit exceeded")
}

console.log("Your new balance is " + newBalance)
}
creditLimitCalculator()