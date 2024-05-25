counter = 0
total = 0

while grades != -1:
  total += grades
  counter += 1
  grades = int(input("Enter student grades or -1 to exit the program"))
  
if average != 0:
  average = total / grades
  print("The total of " + str(counter) + "student is " + str(total), counter)
  print("the class average is ",  average)
  
else:
  print("no grades were received")