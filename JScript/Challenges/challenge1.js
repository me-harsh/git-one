const bill = 430;

let tip = bill >= 50 && bill <= 300 ? .15 : .20;

console.log(`The bill value is: ${bill}`);
console.log(`The tip is: ${bill * tip}`);
console.log(`Total spend: ${bill * tip + bill}`);

