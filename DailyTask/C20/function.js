const prompt = require('prompt-sync')()

//nested function
function higherOrderFunction(){
  console.log('this is a higher order function')
  
  function lowerOrderFunction(){
    console.log('this is a lower order function')
   
    function grandChildFunction(){
      console.log('this is a grand child function')
    }
    grandChildFunction()
  }
  lowerOrderFunction()
}
higherOrderFunction()
//Arrow function
const userName =(name, password, age)=> {
  name = prompt('Enter your name')

  password = prompt('Enter your password')
  age = prompt('Enter your age')

  console.log(name, password, age)

  const userAge =()=>{
    console.log('this is where the user age is')
    
    const userStatus =()=>{
      console.log('this is the user status')
      
    }
    userStatus()
  }
  userAge()
}
userName()


//function as an argument
//it can be called a call-back fuction



function firstFunction(){
  console.log("first function")
}
function secondFunction(callBack){

  console.log("second number")
  callBack()
}
secondFunction(firstFunction)



function secondFunction(function firstFunction(){
  console.log("first function");
})






