const prompt = require("prompt-sync")();

items = []
numbersOfBoughtItems = []
itemsPrice = []
let currentDate = new Date();
let response = ""

let customerName = prompt("What is the customer name? ")
do{

let boughtItems = prompt("What did the customer buy ")
let qunatity = prompt("How many peices were sold? ")
let price = prompt("How much was the price per product? ")
response = prompt("Do you want to add more items? ")

}while(response == "yes");

let cashierName = prompt("What is your name (cashier name)? ")
let discount =  prompt("How muc discount will the customer get? ")
console.log("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HEBERT MACAULAY WAY, SABO YABA, LAGOS\nTEL: 08143123331\nDate:" + currentDate )
console.log("Cashier Name: " + cashierName )
console.log("===========================================================================")
console.log("                  ITEMS \t      QTY       PRICE        \tTOTAL(NGN)")
console.log("---------------------------------------------------------------------------")
console.log("---------------------------------------------------------------------------")
console.log("                                \tsubTotal: \n" + "\n" + "                                       \tDiscount\n" + "\n" + "                                  \tVat @ 17.5%" )
console.log("===========================================================================")
console.log("                                 \tBill Total: ")
console.log("===========================================================================")
console.log("THIS IS NOT A RECEIPT, KINDLY PAY ")

let customerPayment = prompt("How muc did the customer give to you? ")


console.log("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HEBERT MACAULAY WAY, SABO YABA, LAGOS\nTEL: 08143123331\nDate:" + currentDate )
console.log("Cashier Name: " + cashierName )
console.log("===========================================================================")
console.log("                  ITEMS \t      QTY       PRICE        \tTOTAL(NGN)")
console.log("---------------------------------------------------------------------------")
console.log("---------------------------------------------------------------------------")
console.log("                                \tsubTotal: \n" + "\n" + "                                       \tDiscount\n" + "\n" + "                                  \tVat @ 17.5%" )
console.log("===========================================================================")
console.log("                                 \tBill Total: \n" + "\n" + "                                     \tAmount Paid: \n"+ "\n"  + "                               \tBalance: \n")
console.log("===========================================================================")
console.log("                  \tTHANK YOU FOR YOUR PATRONAGE ")


