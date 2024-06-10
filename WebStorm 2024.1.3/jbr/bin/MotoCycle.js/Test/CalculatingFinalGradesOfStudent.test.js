const calculatingFinalGradesOfStudentTest = require("./CalculateFinalGradesOfStudent")

test('test if grades is 80-89', ()=>{
    let result = calculatingFinalGradesOfStudentTest('A')
    expect(calculatingFinalGradesOfStudentTest(80-89))
})

test('test if grades is 70-79', () => {
    let result = calculatingFinalGradesOfStudentTest('B')
    expect(calculatingFinalGradesOfStudentTest(70-79))
})
test('test that grades is 60-69', () =>{
    let result = calculatingFinalGradesOfStudentTest('C')
    expect(calculatingFinalGradesOfStudentTest(60-79))
})

it('test that grades is 80-89', () => {
    let result = calculatingFinalGradesOfStudentTest('D')
    expect(calculatingFinalGradesOfStudentTest.(80-79).toBe('A'))

});