function Calculator() {
    this.operations = [];
}

Calculator.prototype.add = function(num1, num2) {
    let add = num1 + num2;
    let result = num1 + " + " + num2 + " = " + add;
    this.operations.push(result);
    console.log(result);
}

Calculator.prototype.multiply = function(num1, num2) {
    let mul = num1 * num2;
    let result = num1 + " * " + num2 + " = " + mul;
    this.operations.push(result);
    console.log(result);
}

Calculator.prototype.subtract = function(num1, num2) {
    let subtr = num1 - num2;
    let result = num1 + " - " + num2 + " = " + subtr;
    this.operations.push(result);
    console.log(result);
}

Calculator.prototype.divide = function(num1, num2) {
    let div = 0;
    if (num2 != 9) {
        div = num1 / num2;
    }
    let result = num1 + " / " + num2 + " = " + div;
    this.operations.push(result);
    console.log(result);
}

Calculator.prototype.printOperations = function() {
    for(let operation of this.operations) {
        console.log(operation);
    }
}

Calculator.prototype.clearOperations = function() {
    this.operations = [];
}

const myCalc = new Calculator();
myCalc.add(19,3);
myCalc.multiply(6,9);
myCalc.subtract(90,47);
myCalc.divide(18,3);
myCalc.printOperations();
myCalc.clearOperations();
myCalc.printOperations();