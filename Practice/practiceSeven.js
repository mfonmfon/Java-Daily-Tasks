const prompt = require("prompt-sync")();

function averageAcceleration(firstVelocityInMeter,secondVelocityInMeter, timeSpan){
	firstVelocityInMeter = prompt("Enter velocity0: ");
	secondVelocityInMeter = prompt("Enter velocity1: ");

	timeSpan = prompt("Enter the time span");
	let total = firstVelocityInMeter + secondVelocityInMeter ;
	let average = total  / 10;
	
	
	console.log(average);
}
console.log(averageAcceleration());