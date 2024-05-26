let principal = 1000
let rate = 0.05

for(let years = 0; years < 10; years++){
  let amount = principal * Math.pow(1.0 + rate , years);
  console.log(years, amount)
}