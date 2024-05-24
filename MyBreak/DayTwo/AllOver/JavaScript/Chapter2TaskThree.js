const prompt =  require("prompt-sync")();

function sumNumber(firstNumber, secondNumber, thirdNumber){

  let sum = firstNumber + secondNumber + thirdNumber;
  return sum 
}
function productOfNumbers(firstNumber, secondNumber, thirdNumber){
  let product = firstNumber * secondNumber * thirdNumber
  return product
}
function averageNumbers(firstNumber, secondNumber, thirdNumber){
  let average = 0;
  let sum = firstNumber + secondNumber + thirdNumber;
  average = average / sum;
  return average;
}
function smallestAndLargestNumber(firstNumber, secondNumber, thirdNumber, largest, smallest){

  let largest = 0
  let smallest = 0

  if(firstNumber > secondNumber || firstNumber > secondNumber){
    largest = firstNumber
    return largest

  }
  else if(secondNumber > thirdNumber || secondNumber > firstNumber){
    largest = secondNumber
    return largest

  }
  else if(thirdNumber > firstNumber || thirdNumber > secondNumber){
    largest = thirdNumber

  }
  else if(firstNumber < secondNumber || firstNumber < thirdNumber){
    smallest = firstNumber
    return smallest
  }
  else if(secondNumber < thirdNumber || secondNumber < firstNumber){
    smallest = secondNumber
    return smallest
  }
  else if(thirdNumber < secondNumber || thirdNumber < firstNumber){
    smallest = thirdNumber
    return smallest

  }

}

