grade_counter = 0
grades = 0
passes = 0
failed = 0

while grade_counter < 10:
  grades = int(input("Enter grades: "))
  if grades > 10:
    passes += 1
    
  else:
    failed += 1
    
  print("passes: " + passes + " failures: " + failed)