const prompt = require("prompt-sync")();


//collect 5 numbers and checking for the maximum number and the minimum number

// let maximumNumber = 0
// let minimumNumber = 0;
// for(let index = 0; index < 5; index++){
//   let numbers = prompt("enter a number")

// if(numbers > maximumNumber){
//   maximumNumber = numbers
// }
// if(numbers < minimumNumber){
//   minimumNumber = numbers
// }
// }
// console.log("maximum number is " + maximumNumber )
// console.log("minimum number is " + minimumNumber)


//check if a number is divisible by  3

// let userInput = prompt("Enter a number ")

// if(userInput % 3 == 0){
//   console.log("the number is divisible by 3");
// }
// else{
//   console.log("check number again")
// }


// let firstNumber = prompt("Enter first number")
// let secondNumber = prompt("Enter second number")
// if(firstNumber % 3 == 0 || secondNumber % 3 == 0){
//   console.log("valid number")
// }
// else{
//   console.log("not required")
// }

// let radiusOfCircle = prompt("Enter radius of circle: ")
// let diameterOfCircle = 0
// let areaOfCircle = 0
// let circumference = 0

// diameterOfCircle = radiusOfCircle * radiusOfCircle
// circumference = diameterOfCircle * (Math.PI / 2)
// areaOfCircle = Math.PI / 2
// // console.log(areaOfCircle)
// let number = 0
// for(var i = 0; i < 5; i++) {
// number = prompt("Enter a number: ")
// console.log(number);
// }
// let number = 0;
// let name;
// do{
//   name = prompt("Enter your name:");
//   //console.log(name);

//   number++
// }while(number < 5)

  // let num = [1]
  // for(let i = 0; i < num.length; i++){
  //   if(num[i] % 2 == 0){
  //     console.log( num[i] + "is an even number")
  //   }
   
  // }

// let favoriteSinger = ["Tems", "Prinx Emmanuel", "Ayra star" ]
// for(let i = 0; i < favoriteSinger.length; i++){
//   console.log("FavoriteSinger", favoriteSinger[i]);
// }
// console.log(favoriteSinger[1])

// let favouriteNumber = [100000,20000000,300000000000]
// console.log(favouriteNumber[1])

// let mixedArrays = ["mixes",["two","nine"], 123, true]
// console.log(mixedArrays[0])


// const fruits = [
//   "mango", "paw-paw", "pinaples",
//   "apple", "orangr"
// ]
// const moreFruits = ["grapes", "pear", "tangerine", "cucumber" ]

// const totalFruits = fruits.concat(moreFruits)
// console.log(totalFruits)

// const person ={
//   userName: "John",
//   age: 21,
//   userEmail: "john@gmail.com",
//   occupation: "content creator",
//   location: ["Lagos", "Nigeria", "Akwa Ibom"]

  
// }
// console.log(person.userName)
// console.log(person.userEmail)
// console.log(person.occupation)
// console.log(person.location)
// console.log(person.age)
// console.log(person)

// const car = {
//   type : "Toyota",
//   model : "corola",
//   color : "black"
// }
// // console.log(typeof car.model)
// // console.log(typeof car.type)
// // console.log(typeof car.color)
// // console.log(car.model)
// // console.log(car.type)
// // console.log(car.color)
// console.log(car)
// console.log(typeof car)
// console.log(car.type = "RangeRover")
// car.wheels = 3

// function productOf(firstNumber, secondNumber){
//   return firstNumber * secondNumber
  
// }
// // let totalNumbers = productOf(100, 20000)
// console.log(totalNumbers)
// console.log(productOf(100, 20))

// function driveCar(engine){
//   const engineName = "standard"

//   engine(engineName)
// }
// driveCar(function(engineName){

//   console.log(engineName)
// })

// function driveCar(userName, userEmail, password, callBack){
//    userName = prompt("Enter your name ")
//    userEmail = prompt("Enter your email address ")
//    password = prompt("Enter your password ")

//   if(password > 8 || password < 8){
//     console.log("Please enter a valid password")

//   }
//   else if(password.includes("@") || password.includes("!")){
//     console.log("this is a password")
//   }
//   else{
//     console.log("please enter a strong password, it must have characters")

//     callBack();
//   }

//   //callBack();
// }

// function callBack(){
//   console.log("Welcome to Banke Bank, create a strong password today")
// }
// driveCar("", callBack());

// function showCallBack(fn){
//   const value = prompt("Enter your name:")

//   fn(value);
// }
// showCallBack(function fn(value){

//     console.log("Hello " + value);
// })


// for(let index = 0; index < 100; index++){
//   let number = 0;
//   if(number % 3 == 0){
//     console.log("Fizz");
//   }
//   else if(number % 5 == 0){
//     console.log("buzz")
//   }
//   else if(number % 3 == 0 && number % 5 == 0){
//     console.log("fizzbuzz");
//   }
//   else if(number % 3 == 0 || number % 5 == 0){
//     console.log("fizz or buzz")
//   }
// }
// let grid = prompt("Enter a symbol")
// for(let index = 1; index < 9; index++){
//   console.log(grid + " x " + index)
//   for(let j = 0; j < 9; j++){

//     console.log( + "  " + grid)
//   }
// }

// console.log("Game started")
// let userResponse = prompt("Play a game using q and r or enter x to quit the game")

// if(!userResponse =="q" && !userResponse == "Q"){
//   console.log("you got a very good answer here ")
// }
// else if(!userResponse == "r" && !userResponse =="R"){
//   console.log("seems you not familiar with the game ")
// }
// else{
//   console.log("you failed to use the format of the game ")
// }

//   let name = ""
// while(name != null){
//   name = prompt("Enter name:")
// }
// console.log("Hello, " + name)


//checking the length of a string
// let userEmail = prompt("Enter your email address: ")
// let emailLength = 0;

// emailLength = userEmail.length;
// if(emailLength > 10){console.log(" Invalid email address: ")}
// else{(console.log("Acceess allowed"))}

// let firstName = "Desmond"
// firstLetterOfTheFirstName = firstName[0]
// console.log(firstLetterOfTheFirstName)         // checking for the index in a string


// let firstName = "Jello World"
// firstName = "Hello world!"
// console.log(firstName) //
 // checking for the index in a string

//  let firstName = "Hello world"
//  let firstLetterOfTheFirstName = firstName[firstName.length -3]
//  console.log(firstLetterOfTheFirstName) //




// let numberOfRadius = prompt("Enter the number of radius")
 
