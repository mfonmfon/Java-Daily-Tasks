const prompt = require("prompt-sync")();

function calculatingEnergy(){
	let weightOfWaterInKilogram = 0;

	
	let temperature = prompt("Enter the amount of water in kilograms: ");

	let initialTemperature = prompt("Enter the initial temperature: ");

	let finalTemperature = prompt("Enter the final temperature: ");

	
	weightOfWaterInKilogram = temperature * (finalTemperature - initialTemperature)  * 4184;

	console.log("The energy needed is  " + weightOfWaterInKilogram)
	

}
console.log(calculatingEnergy());