cubes = 0
squares = 0

print("Number      \tSquares    \tCubes")
for numbers in range(11):
  squares = numbers * numbers
  cubes = squares * numbers
  
print("\t " + numbers + "  \t" + squares + " \t" + cubes )
  