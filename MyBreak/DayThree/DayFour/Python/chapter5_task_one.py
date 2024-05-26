def interest():
  principal = 1000
  rate = 0.05

  for years in range(10):
    amount = principal * pow(1.0 + rate , years)
    print(amount, years)
  
interest()