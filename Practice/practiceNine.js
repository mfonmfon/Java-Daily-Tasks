const prompt = require("prompt-sync")();

function showCurrentTime(){
	currentTime = prompt("Enter the time zone offset to GMT");
	let time = new Date();
	resultForCurrentTime = currentTime / 60

	console.log(time);
}
console.log(showCurrentTime());