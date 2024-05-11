const prompt = require("prompt-sync")();

function sumDigitInAnInteger(){
	let total = 0;
	let number = Number(prompt("Enter a number between 0 and 100: "));


	while(number!= 0){   

		total = total + number % 10;
		number = Math.floor(number / 10);
	}
	return total;
}
console.log(sumDigitInAnInteger());
 