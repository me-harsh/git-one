/*let js = "amazing";
console.log(50.4 - 10 + 4);

let firstName = "Matilda";
console.log(firstName);
console.log(firstName);
console.log(firstName);

let jonas_and_matilda = "JM";

let PI = 3.1432;

console.log(PI);
*/
// let boolValue = true;
// let boolInt = 0;
// console.log(boolInt);
// console.log(boolValue);
// console.log(typeof boolValue);
// console.log(typeof boolInt);

// const myYear = 76;
// // myYear = "hello";

// console.log(myYear, boolValue);

// console.log('String with \n\with multiple \n\
// line');

// console.log(`hello
// everyone 👀`);

const tellMeTheDay = prompt(`What's the day:`);
console.log(tellMeTheDay);

switch (tellMeTheDay) {
    case `monday`:
        console.log(`hello everybody`);
        break;
    case `tuesday`:
        console.log(`write a diary ✍️`);
        break;
    case `wednesday`:
    case `thursday`:
        console.log(`tell me about yourself! 🙌`);
        break;
    case `friday`:
        console.log(`today was hectic day. 🤫`);
        break;
    case `saturday`:
    case `sunday`:
        console.log(`Yay weekend😪`);
        break;
    default: console.log(`NOT A DAY IDIOT!!`);
}
