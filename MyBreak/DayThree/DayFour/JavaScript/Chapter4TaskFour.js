const prompt = require('prompt-sync')()
function salesCommissionCalculator() {
let numberOfItems = prompt("Enter the number amount you sold for last month  ")
let total = 0
total += numberOfItems

console.log("Index   \tValue")
for(let index = 0; index < 5; index++) {
  console.log(index + "  \t" + total)
}
}
salesCommissionCalculator()