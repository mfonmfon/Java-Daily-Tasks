let firstArrays = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function evenNumber(numbers) {
    let newNumbers = new Array(numbers);
    for (let index = 0; index < numbers.length; index++) {
        if (newNumbers[index] % 2 === 0) {
            newNumbers.push(numbers[index]);
            return newNumbers;
        }
    }
    function anotherEvenNumber(numbers) {
        let anotherArrays = []
        for (let index = 0; index < numbers.length; index++) {
            let isEven = numbers[index] % 2 === 0;
            if (isEven) {
                anotherArrays.push(numbers[index])
                return anotherArrays
            }
        }
        function useAnotherEvenNumbers(numbers) {
            let arr = []
            for (let index = 0; index < numbers.length; index++) {
                let evenIndex = numbers[index] % 2 === 0
                if (eveIndex) {
                    numbers.shift(numbers)
                    return arr
                }
            }
        }
        useAnotherEvenNumbers
    }
    anotherEvenNumber()
}
evenNumber()
    let arr = [1,4,5,7,4,2]
    let newArrays = ['mfon', 'paul', 'david']
   //let (arr,  newArrays)
console.log(arr)



