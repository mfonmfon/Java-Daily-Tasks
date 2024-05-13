const prompt = require("prompt-sync")();

function populationProjection(){

	let population = 0;

	let numberOfDaysInYears = 365

	let numberOfYears = prompt("Enter the number of years: ") ;
	population = Math.floor(numberOfYears * numberOfDaysInYears) / 12;

	console.log(population);

}
console.log(populationProjection());
