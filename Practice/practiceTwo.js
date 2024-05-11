
const prompt = require("prompt-sync")();

let radiusAndLengthOfCylinder = prompt("Enter the radius and length of a cylinder: ");

let radius = 5.5;
let length = 12;
let area = 0;
let volume = 0;

area = radius * radius * 22 / 7;
volume = area * length;

console.log("The area of a cylinder is: " + area + "\n" + "The volume of a cylinder is " + volume);


