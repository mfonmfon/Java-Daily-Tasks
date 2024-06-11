/**
 THIS keyword is a context  keyword
 it represents the object in which the current block of code is being executed
 when we call a method, javaScripts sets this keyword as an object
 *
 */

const prompt = require("prompt-sync")()

let user ={
    name: "Mfon",
    age: 22,
    blog: [
        {title: 'why testing your software before deploying matters', likes: 50},
        {title: 'How to vest as a startup founder', likes: 1000},
    ],
    location: "Nigeria",
    password: "mfon@gamil.com",
    login(){
        console.log("The user logged in!")
    },
    logout(){
        console.log("The user logged out")
    },
    logBlogs(){
        console.log("This user has written the following blogs")
        this.logBlogs.forEach(blog =>{
            console.log(blog)
        })

    },
    username(){

      let name = prompt("Enter your user name: ")
        console.log(`Hello ${name} Welcome to our blogs `)

    },
    userPassword (){
        let password = prompt(`Please enter your password`)
        if(password.length >= 8){
            console.log("Strong password")
        }else if(password.length < 8){
            console.log("Enter a strong password")

        }
        console.log(`Thank you`)
    }
}
user.login()
user.logout()
user.username()
user.userPassword()
user.logBlogs()
