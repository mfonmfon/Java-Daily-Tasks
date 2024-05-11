const prompt = require("prompt-sync")();

function findTheNumberOfYears(){
	let numberOfDays = 0;
	let numberOfYears = 0;
	let numberOfHour = 24;
	let numberOfMinutes = prompt("Enter the number of minutes: ");
	
	let sum = numberOfMinutes / 60 ;
	numberOfDays =  numberOfMinutes * numberOfHour / 60; 
	numberOfYears = numberOfDays  / 12;
	console.log(numberOfDays);

	console.log(numberOfYears);

	console.log(sum);


}
console.log(findTheNumberOfYears());