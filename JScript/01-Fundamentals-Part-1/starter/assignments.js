const country = "India";
const continent = "Asia";
let population = 12;

console.log(country);
console.log(continent);
console.log(population);

let isIsland;
isIsland = true;

// declaring the variable language



console.log(typeof country);
console.log(typeof continent);
console.log(typeof population);
// console.log(typeof isIsland);

let language = "Hindi";
const halfPopulation = population / 2;
// so once this is calculated for the population value here halfPopulation is set to that value and it doesn't change
console.log(halfPopulation);
console.log("Increasing the population");
population += 2;
console.log(population);
console.log(halfPopulation);

const finlandPopulation = 6;
let finlandMorePop = finlandPopulation > population;
console.log(finlandMorePop);
// 'Portugal is in Europe, and its 11 million people speak portuguese'
const description = country + ' isn\'t in ' + continent + ", and its " + population + " million people speak " + language;
console.log(description);

const secDescription = `${country} isn't in ${continent}, and its ${population} million people speak ${language}`;

console.log(secDescription);



let avgPopulation = (33 - population) / 2;
if (population > 33) {
    console.log(`${country}'s population is above average.`)
}
else {
    console.log(`${country}'s population is ${avgPopulation} below average.`)
}