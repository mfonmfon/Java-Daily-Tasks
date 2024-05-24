function smallestAndLargest(){
  let firstNumber = prompt("Enter first number")
  let secondNumber = prompt("Enter second number")
  let thirdNumber = prompt("Enter third number")
  let fourthNumber = prompt("Enter fourth number")
  let fifthNumber = prompt("Enter fifth number")

  let largestNumber = firstNumber
  let smallestAndLargestNumber = fifthNumber

  if(smallestNumber < firstNumber){smallestNumber = firstNumber}
  else if(smallestNumber < secondNumber){smallestNumber = secondNumber}
  else if(smallestNumber < thirdNumber ){smallestNumber = thirdNumber}
  else if(smallestNumber < fourthNumber){smallestNumber = fourthNumber}

  else if(largestNumber > secondNumber){largestNumber = secondNumber}
  else if(largestNumber > thirdNumber ){largestNumber = thirdNumber}
  else if(largestNumber > fourthNumber ){largestNumber = fourthNumber}
  else if(largestNumber > fifthNumber ){largestNumber = fifthNumber}

  console.log("The laregst number is " + largestNumber)
  console.log("The smallest number is " + smallestNumber)
}