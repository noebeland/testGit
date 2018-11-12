const numberOfDigits = 9;
const numberOfKeys = 9;

const operatorDisplay = document.getElementById('operator');
const operandDisplay = document.getElementById('operand');
const resultDisplay = document.getElementById('result');

let firstOperand = 0;
let secondOperand = 0;
let result = 0;
let previousOperator = null;


function add(num1, num2){
    return Number(num1)+Number(num2);
}

function substract(num1, num2){
    return num1 - num2;
}

function multiply(num1, num2){
    return num1 * num2;
}

function divide(num1, num2){
    return num1 / num2;
}

function operate(num1, num2, operator){
    if(operator === "add"){
        return add(num1, num2);
    }else if(operator === "substact"){
        return substract(num1, num2);
    }else if(operator === "multiply"){
        return multiply(num1, num2);
    }else if(operator === "divide"){
        return divide(num1, num2);
    }
}

 function initOperation(operator){
     previousOperator = operator;

     firstOperand = Number(operandDisplay.textContent);
     operandDisplay.textContent = '';

     if (operator === 'add'){
         operatorDisplay.textContent = '+';
     }else if(operator === 'substract'){
        operatorDisplay.textContent = '-';
     }else if(operator === 'multiply'){
        operatorDisplay.textContent = '*';
     }else if(operator === 'divide'){
        operatorDisplay.textContent = '%';
     }
 }

 function displayOperand(number){
     operandText = operandDisplay.textContent.length;
     if(operandText < numberOfDigits){
         operandDisplay.textContent += number;
     }return;
 }

 function compute(){
     if(previousOperator === null){
        resultDisplay.textContent = result = firstOperand = operandDisplay.textContent;
     }else{
         secondOperand = operandDisplay.textContent;
         let result = operate(firstOperand, secondOperand, previousOperator);
         resultDisplay.textContent = firstOperand = result;
     }
 }

 function allClear(){
     firstOperand = secondOperand = result = 0;
     previousOperator = null;

     resultDisplay.textContent = operandDisplay.textContent = operatorDisplay.textContent = '';

 }

 window.onload = function addNumberListeners(){
     
    for(let i = numberOfKeys; i >= 0; i--){
        let numString = i + '';

        document.getElementById(numString).addEventListener('click', function(){displayOperand(i);
    });
 }
 
        document.getElementById('dot').addEventListener('click', function(){
            if(operandDisplay.textContent.includes('.')){
                return;
            }else
                displayOperand('.');
        });
    }
    
 const plusButton = document.getElementById('plus').addEventListener('click', function(){initOperation('add');});
 const minusButton = document.getElementById('minus').addEventListener('click', function(){initOperation('substract');});
 const timesButton = document.getElementById('times').addEventListener('click', function(){initOperation('multiply');});
 const dividedButton = document.getElementById('divided').addEventListener('click', function(){initOperation('divide');});

 const equalButton = document.getElementById('equals').addEventListener('click', compute);
 const clearButton = document.getElementById('clear').addEventListener('click', allClear);


