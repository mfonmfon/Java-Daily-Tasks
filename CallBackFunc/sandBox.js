const ul = document.querySelector('.person')
const people = ["Home", "About Us","Price ", "Contact"]

let html = ``;

people.forEach(person =>{
  html += `<li style="color:mediumblue">${person}</li>`;
})
console.log(html);
ul.innerHTML = html;