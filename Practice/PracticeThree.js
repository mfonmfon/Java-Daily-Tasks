const prompt = require("prompt-sync")();
let degreeCelsius = prompt("Enter a degree in Celsius: ");

let celsius = 1.8;
let number = 32;

let fahrenheit = degreeCelsius * celsius  + number;

console.log(degreeCelsius + " Celsius is " + fahrenheit);