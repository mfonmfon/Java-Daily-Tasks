const prompt = require("prompt-sync")()

let counter = 0
let total = 0
while(grades !=  -1){
  total += grades
  counter += 1
  let grades = prompt("Enter your student grades or -1 to exit ")
}
if(average != 0){
  average = total / grades
  console.log("The total of "  + counter + " grade  is " + counter + grades)
  console.log("The class average is " + average);
}
else{
  console.log("no grades were received")
}