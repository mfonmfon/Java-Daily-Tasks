function tabularOutputs(){
  let firstNumber = 0;
  let secondNumber = 0;
  let thirdNumber = 0;

  console.log("N  \tN2  \tN3  \tN4")
  for(let index = 0; index < tabs.length; index){
    firstNumber = index * index 
    secondNumber = index * index * index
    thirdNumber = index * index * index * index
    console.log(index + " \t" + firstNumber + " \t" + secondNumber + " \t" + thirdNumber)
  }
}