def sumNumbers(firstNumber, secondNumber, thirdNumber):
  sum = firstNumber + secondNumber + thirdNumber
  
  print(sum)
  
  
def productOf(firstNumber , secondNumber , thirdNumber):
  product = firstNumber * secondNumber * thirdNumber
  
  print(product)
  
  
def averageOf(firstNumber , secondNumber , thirdNumber):
  average = 0
  sum = firstNumber * secondNumber * thirdNumber
  
  print(sum)
  
def largestAndSmallest(firstNumber , secondNumber , thirdNumber):
  largest = 0
  smallest = 0
  
  smallest = thirdNumber 
  largest = firstNumber
  
  if largest > secondNumber:
    largest = secondNumber
  elif largest > thirdNumber:
    largest = thirdNumber
  elif smallest < firstNumber:
    smallest = firstNumber
  elif smallest < secondNumber:
    smallest = secondNumber