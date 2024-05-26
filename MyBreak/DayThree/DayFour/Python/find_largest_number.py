def find_largest_number():
  counter = 0
  largest_number = 0

  while counter < 10:
    user_input = int(input("Enter a number:"))
  
    if largest_number < user_input:
      largest_number = user_input
    
      counter += 1
    
    print("the largest number is " + str(largest_number))
find_largest_number()
    