account_number = int(input("Enter your account number: "))

if account_number < 10 or account_number > 10:
  print("Please enter a valid account number")
  
else:
  beginning_balance = int(input("Enter your balance at the beginning of the months: "))
  charges = int(input("Enter your charges"))
  credit_limit = int(input("Enter your credit limit applied to the customer this months: "))
  
  new_balance = beginning_balance + charges - credit_limit
  print("Your new balance is : " + str(new_balance))
  if new_balance < 0.0:
    print("You've exceeded your credit limit, please try again later.")
    