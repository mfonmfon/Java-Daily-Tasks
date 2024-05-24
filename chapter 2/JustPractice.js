const prompt = require("prompt-sync")();

let name = prompt("Enter your name:")

let counter = 0

while(counter < 10){
  console.log(name)
  counter++
}