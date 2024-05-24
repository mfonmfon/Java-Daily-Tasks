const prompt = require("prompt-sync")();

function menuBar(){
options = `----Welcome to MyChekker Healthcare----
We are on a mission to improve the well-being of all women
 1  signUp
2  Login
`)
console.log(options)

let userName = prompt("Enter your full  name: ")
console.log("\n")
let userAge = prompt("How old are you: ")
	if(userAge < 12 || userAge > 12){console.log("Oops!! You cant be menstruating at this age")}
	else{console.log("SignUp Successfully>>>>\nFollow the instructions below to check your period info ")}

	let userPeriodOptions = prompt("What are the signs of your period coming : ")
	if(userPeriodOptions == "Tender breast" ||userPeriodOptions== "tender breast" ||  userPeriodOptions == "Bloating" userPeriodOptions =="bloating" || userPeriodOptions == "Abdominal cramps"){
		console.log("\n")

		let periodDate  = prompt("Enter the first day you saw your period using this format (dd/mm/yyyy):  ")
		let cycleLength = prompt("What is the average length of the menstruation : ")

		let date = new Date(periodDate)
		let  expectedDate = new Date(date.setDate(date.getDate() + cycleLength))
		let ovulationDate = new Date(ovulationDate.setDate(expectedDate))

		let  fertilityDate = 5

		console.log("Your next period date is " + newDate)
		console.table("Your ovulation period is " + ovulationDate)
		console.log("your fertility period is ")}
	else{
		console.log("You entered a wrong input")
	}
}
menuBar()



