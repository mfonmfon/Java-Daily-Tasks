const prompt = require("prompt-sync")()

function checkingForStudentPassMark(){
let gradeCounter = 0
let studentGrades = 0
let passes = 0
let failed = 0

while(gradeCounter < 10){

  studentGrades = prompt("Enter grade: ")
  if(studentGrades > 10){passes += 1}
  else{failed += 1}

  gradeCounter += 1
}
console.log("Passed: " + passes + "\nFailures: " + failed)

}