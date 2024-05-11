const prompt = require("prompt-sync")();

let numberInPounds = prompt("Enter a number in pounds: ");

let kilogram = 0.454;

let result = numberInPounds * kilogram;

console.log(numberInPounds + " pounds " + result + " Kilogram "); 