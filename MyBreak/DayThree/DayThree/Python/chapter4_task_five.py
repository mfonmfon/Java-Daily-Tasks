
def tabular_output():
  first_number = 0
  second_number = 0
  third_number = 0

  print("N  \tN2  \tN3  \tN4")

  for index in range(6):
    first_number = index * index 
    second_number = index * index * index
    third_number = index * index * index * index

    print(index + "\t" + second_number + "\t" + third_number)
tabular_output