
let onBike = true;
let  currentSpeed = 40;
let gear;
function checkThatBikeIsOn(){
     onBike = true;
}
function checkThatBikeIsOff(){
    onBike = false;
}
checkThatBikeIsOff()
function accelerate(){
    checkThatBikeIsOn();
    if(currentSpeed < 0 && currentSpeed >=  20){
        return currentSpeed +1
    }else if(currentSpeed <= 21 && currentSpeed > 31){
        return currentSpeed +2
    }else if(currentSpeed <= 30 && currentSpeed > 40) {
        return currentSpeed +3
    }else{
        return currentSpeed +4
    }
}
accelerate()
function decelerate(){
    if(currentSpeed < 0 && currentSpeed >= 20 ){
        return currentSpeed -1
    }else if(currentSpeed <= 21 && currentSpeed >= 30){
        return currentSpeed -2
    }else if(currentSpeed >= 31 && currentSpeed >= 40){
        return currentSpeed -3
    }else{
        return  currentSpeed -4
    }
}
decelerate()
