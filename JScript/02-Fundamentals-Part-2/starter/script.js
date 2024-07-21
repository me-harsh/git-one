// hello guys
'use strict';
function consoler() {
    const interface1 = 'audio';
    console.log(interface1);
}

function clacAge1(birthYear) {
    return 2037 - birthYear;
}

let calcAge2 = function (birthYear) {
    return 2037 - birthYear;
}
// calcAge2 = birthYear => 3033 - birthYear;
// the above line won't produce error as the variable calcAge2 is let and not const 

const calcAge3 = birthYear => 2037 - birthYear;
// calcAge3 = birthYear => 2047 - birthYear;//*as then this line when uncommented will produce error
// so we use const to fix the expression of the function.

let aniketAge = calcAge3(2003);
let harshAge = calcAge3(2004);
console.log(aniketAge);
console.log(harshAge);

calcAge2 = birthYear => 3033 - birthYear;

// so now the same function has changed its definition here 
// but above this it will follow the previous definition.
aniketAge = calcAge2(2003);
harshAge = calcAge2(2004);
console.log(aniketAge);
console.log(harshAge);


// Arrays in JS

const friend = ["Niranjan", "Peter", "Eshan", "Yash", "Aniket"];
console.log(friend);



const myProfile = {
    firstName: "Harsh",
    lastName: "Raj",
    job: "student",
    hasDriverLicense: true,
    friends: friend,
    birthYear: 2003,
    calcAge: function () {
        this.age = 2047 - this.birthYear;
        return this.age;
    },
    getSummary: function () {
        return `${this.firstName} is a ${this['calcAge']()}-year old ${this.job}, and he has ${this.hasDriverLicense ? 'a' : 'no'} driver's license`;
    }
};
console.log(myProfile);

console.log(`${myProfile.firstName} has ${myProfile.friends.length} friends, and his best friend is ${myProfile.friends[0]}`);

console.log(myProfile.calcAge());

console.log(myProfile.getSummary());

/* Write your code below. Good luck! 🙂 */

const mark = {
    fullName: "Mark Miller",
    mass: 78,
    height: 1.69,

    calcBMI: function () {
        this.bmi = this.mass / this.height ** 2;
        return this.bmi;
    }

}

const john = {
    fullName: "John Smith",
    mass: 92,
    height: 1.95,

    calcBMI: function () {
        this.bmi = this.mass / this.height ** 2;
        return this.bmi;
    }

}

if (john.calcBMI() > mark.calcBMI()) {
    console.log(`${john.fullName}'s BMI (${john.bmi}) is higher than ${mark.fullName}'s (${mark.bmi})!`);
}
else console.log(`${mark.fullName}'s BMI (${mark.bmi}) is higher than ${john.fullName}'s (${john.bmi})!`);

let dice = Math.trunc(Math.random() * 6) + 1;

while (dice !== 6) {
    console.log(`You rolled a ${dice}`);
    dice = Math.trunc(Math.random() * 6) + 1;
}