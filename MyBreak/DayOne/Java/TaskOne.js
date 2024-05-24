function languagePreference(){
  console.log("Welcome to Banke Bank")
  console.log(`
    1 -> Yoruba
    2 -> Igbo
    3 -> Hausa
    4 -> Ibibio
    5 -> English  
  `)
  const langugae = prompt("Select your language preference")

  switch (langugae) {
    case 1:
      console.log("the language you entered is not up to date machine")
    case 2:
      console.log("the language you entered is not up to date on this machine")
    case 3:
      console.log("the language you entered is not up to date on this machine")
    case 4:
      console.log("the language you entered is not up to date on this machine")
    case 5:
      menue()
     
  }
  languagePreference()

}
function menue(){
  console.log("you")
}