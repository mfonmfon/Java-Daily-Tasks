const prompt = require("prompt-sync")();

function guessRandomNumbers(){
	let firstNumber = (Math.random() + 10)
	let secondNumber = (Math.random() + 10)

	let answer = prompt("what is " +  firstNumber + "+" + secondNumber + " ? ")

	while(firstNumber + secondNumber != answer){
		console.log("I am so disappointed in you!!\NThis small mathematics you dont know ")
		answer = prompt("what is " + firstNumber + "+" + secondNumber + " ? ")

	}
	console.log("You got it! ")

}
guessRandomNumbers()
