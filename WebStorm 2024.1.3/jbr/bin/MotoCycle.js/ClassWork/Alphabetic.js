function checkTheLengthOfAlphabetic() {
    let alphabetic = ["A", "B", "C", "D", "E", "F"];
    let theLength = alphabetic.length;
    if(alphabetic.length < 4) {console.log("Invalid length of alphabetic")}
    else {console.log(theLength)}
    return theLength;
}
checkTheLengthOfAlphabetic()