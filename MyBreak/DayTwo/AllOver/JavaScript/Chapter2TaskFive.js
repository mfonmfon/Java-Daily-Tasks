function areaOfCircle(){
  let area = prompt ("Enter the area of the circle")

  const pi = 3.14159

  let radius = 0
  let diameter = 0
  let circumference = 0

  diameter = radius * radius
  circumference = diameter *  pi
  area = pi * diameter

  console.log("the area of the circle is  " + area)
}