// Remember, we're gonna use strict mode in all scripts now!
"use strict";

const temp = [3, -2, -6, 1, "error", 9, 13, 17, 15, 14, 9, 5];

//` todo: temperature amplitude => mean temperature difference between max and min in a given time period

// console.log(typeof "hi");
const tempAmplitude = function (temp) {
  let min = temp[0],
    max = temp[0];
  for (let i = 1; i < temp.length; i++) {
    let curr = temp[i];
    if (typeof curr === "string") i++;
    // debugger;
    if (curr > max) {
      max = curr;
    }
    if (curr < min) {
      min = curr;
    }
  }
  console.log(max);
  console.log(min);
  return max - min;
};

console.log(tempAmplitude(temp));

// debugging part
console.log(`Doing debugging...`);
const measureKelvin = function () {
  // it creates an object with these properties
  const measurement = {
    type: "temp",
    unit: "celsius",
    value: Number(prompt(`Degree Celsius: `)),
  };
  const kelvin = 273 + measurement.value;
  return kelvin;
};

// console.log(measureKelvin());

// INFO these are just style of formatting.
// console.warn(`hello`);
// console.error(`hello`);

//challenge problem
const data1 = [17, 21, 23];
const data2 = [12, 5, -5, 0, 4];

const printForcast = function (tempData) {
  let str = `...`;
  for (let i = 0; i < tempData.length; i++) {
    str += ` ${tempData[i]}°C in ${i + 1} days ...`;
  }
  return str;
};
console.log(printForcast(data1));
