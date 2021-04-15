let display;
let previous = null;
let operator = null;
let operatorClicked = false;

function performOperation() {                                     /* Calculates the operation & updates the display.*/
  let result;
  const current = parseNumber(display.value);
       previous = parseNumber(previous);

  switch(operator) {
    case '+' : result = previous + current;
    break;
    case '-' : result = previous - current;
    break;
    case '*' : result = previous * current;
    break;
    case '/' : result = previous / current;
    break;}
        display.value = result; operator = null;}

function parseNumber(num) {                                       /* Parses the display value into a number (float or int). @param {String} num */
  return num.includes('.') ? parseFloat(num) : parseInt(num);}

function clickOperator(event) {                                   /* Captures the previous value & the clicked operator so that an operation can be performed.*/
  operator = event.target.value;
  previous = display.value;
  operatorClicked = true;}

function clickNumber(event) {                                     /* Captures a number click & updates the display value. @param {Event} event */
  const val = event.target.value;
  if(operatorClicked) {display.value = val;
     operatorClicked = false;
} else {display.value == 0 ?                                    
      display.value = val:
      display.value += val;}}

function clear() {display.value = 0;}                             /* Resets the display value.*/
      document.addEventListener('DOMContentLoaded', () => {       /* adds event listener for when the DOM is loaded */       
      display = document.getElementById('display');               /* set the variable called 'display' equal to the display element. HINT: use its id #display to get a reference to it */
const allNumbers = document.querySelectorAll('.number');          /* get reference to all of the numbers */
      allNumbers.forEach((loopOver) => {                          /* loop over each of the numbers */
      loopOver.addEventListener('click', clickNumber)});          /* adds click event listener to each number to call the clickNumber function */                                    
const theDecimal = document.querySelector('.decimal');            /* get reference to the '.decimal' button */
                                                                  /* adds click event listener to call the clickNumber function */
      theDecimal.addEventListener('click', clickNumber);          /* Appends the decimal point as part of the number */
const allClear = document.querySelector('.all-clear');            /* get reference to the '.all-clear' button */
      allClear.addEventListener('click', clear);                  /* adds 'click' event listener to call the clear function */
const helloOperator = document.getElementsByClassName('operator');/* get reference to all of the operators*/

Array.from(helloOperator).forEach((loopOver) => {                 /* loop over each of the operators */
      loopOver.addEventListener('click', clickOperator);          /* adds 'click' event listener to each operator to call the clickOperator function */
const theAnswer = document.querySelector('.equal-sign');          /* adds 'click' event listener for the '.equal-sign' */
      theAnswer.addEventListener('click', performOperation);})}); /* calls the performOperation function */