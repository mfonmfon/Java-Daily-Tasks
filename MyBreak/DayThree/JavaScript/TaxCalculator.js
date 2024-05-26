const prompt = require("prompt-sync")()
function taxCalculator(){
taxRate = 15
console.log(`
  1. Nigeria
  2. USD
`)
let name = prompt("Enter full name : ")
let citizenEarnings = prompt("How much do your earn")
if(citizenEarnings < 15){
  console.log("Hello " + name + " Your  tax is " + taxRate)
}
else if(citizenEarnings > 20){
  console.log("Hello " + name + "your tax is " + 20) 
}
}
taxCalculator()




