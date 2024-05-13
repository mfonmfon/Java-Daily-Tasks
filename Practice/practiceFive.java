const prompt = require("prompt-sync")();

let subTotal = prompt("Enter the subtotal: ");
let gratuityRate = prompt("Enter a gratuity rate: ");

let gratuity = subTotal / gratuityRate;

let total =  subTotal + gratuity;

console.log("The gratuity is $",gratuity,"and the total is $", total);

