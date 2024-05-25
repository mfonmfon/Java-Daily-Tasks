def check_forLength_of_a_string():
  name = input("type a word ")
  length_name = 0
  length_name = len(name)
  
  if length_name > 10:
    print("invalid length")
  else:
    print(length_name)
  
 # print(length_name)
  
#check_forLength_of_a_string = check_forLength_of_a_string()


def accessing_arrays():
  number = [1,2,3,4,5,6,7,8,9,10,11,12]
  number.append(1, 55)
  print(number)
  
  #accessing_arrays()