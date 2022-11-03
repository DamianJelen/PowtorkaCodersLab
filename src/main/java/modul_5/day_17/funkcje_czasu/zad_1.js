const setIntervalZad1 = setInterval(function() {
  console.log("Wygenerowano z setInterval");
}, 10000);
const setTimeoutZad1 = setTimeout(function() {
  console.log("JavaScript Rules");
}, 4000);

clearInterval(setIntervalZad1);
clearTimeout(setTimeoutZad1);