function checkfunction(isNumber, name){
    isNumber = true
    name = 'mfon'
    console.log(isNumber, name)

    function arraysOfPlanet(){
        let planets = ["Earth", "Jupiter", "Mercury","Closure", "Waram"]
        for(let index = 1; index < planets.length; index++){
            console.log(index + " " +planets[index])
        }
        function wowDataTypes(){
            let dataTypes = ["adda", 1,2,3, true, 9.0]
            for(let index = 1; index < dataTypes.length; index++){
                console.log(index + " " + dataTypes[index])
            }
            const  validateForArrays = function (input){
                if(toString(input) === ["object_Arrays"]){
                    return true
                }
                else {
                    return false
                }
            }
            console.log(validateForArrays([1,2,3,4,5,6,7,8,9,10]))
            console.log(validateForArrays("dfj"))
        }
        wowDataTypes()
    }
    arraysOfPlanet()
}
checkfunction()
