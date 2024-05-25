number = 0
negativeNumber = 0
positveNumber = 0
for index in range(5):
  number = int(input("Enter a number"))
  
  if number % 2 == 0:
    print(number + "is a positive number ")
  elif number % 2 == 1:
    print(number + "is a negative number ")
