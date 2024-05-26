def sales_commission_calculator():
  numbersOfItems = int(input("Enter the number of items you sold for last month "))
  total = 0
  total += numbersOfItems
  print("index  \tValue")
  for index in range(5):
    print(index + "\t" + total)
  
sales_commission_calculator()