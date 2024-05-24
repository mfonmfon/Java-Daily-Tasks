function squaresInTable (){
  let cubes = 0
  let squares = 0;
  console.log("Numbers      \tSquares     \tCubes")
  for(let index = 0; index < 11; index++){
    squares = index * index
    cubes = squares * index
    console.log("   \t" + index + "     \t" + squares + "     \t" + cubes)
  }
}