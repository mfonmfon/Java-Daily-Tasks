def tax_calculator():
  tax_rate = 15
  name = input("Enter your full name ")
  print("""
        
        1. Nigeria
        2. USA
        """)
  country_name = int(input("select your country"))
  citizen_earning = int(input("How muc do you earn :"))
  if citizen_earning < tax_rate:
    citizen_earning -= tax_rate
    print("Hello " + name + " Your  tax is " + str(tax_rate))
    
  elif citizen_earning > 20:
    print("Hello " + name + "your tax is " + 20)