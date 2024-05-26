const prompt = require("prompt-sync")()

function gasMillage(){
  
  let milesDriven = prompt("Enter the miles driven ")
  let gallonUsed = prompt("Enter the the gallon used for each trip ")

  let milesPerGallon = milesDriven/ gallonUsed

  console.log("the miles pergallon is ", milesPerGallon)
}
gasMillage()