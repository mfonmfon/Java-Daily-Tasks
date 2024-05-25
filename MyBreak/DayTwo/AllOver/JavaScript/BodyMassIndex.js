const prompt = require("prompt-sync")()

let weightInKilograms = prompt("Enter your weight in kilograms  ")
let heightInMeters = prompt("Enter your height in meters ")

totalWeightInKilograms = weightInKilograms * 703
totalHeightInMeters = heightInMters * heightInMeters

bodyMassIndex = totalWeightInKilograms / totalHeightInMeters

console.log("your body mass index is " + bodyMassIndex)