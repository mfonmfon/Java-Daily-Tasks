weight_in_kilograms = int(input("Enter your weight in Kilograms"))
height_in_meters = int(input("Enter your height in Meters"))

total_weight = weight_in_kilograms * 703
total_height = height_in_meters * height_in_meters

body_mass_index = total_weight / total_height
print("your body mass index is " + str(body_mass_index))