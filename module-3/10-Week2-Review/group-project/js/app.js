/* Define any shared data required by the app 
    Score
        Set of problems
            Each problem has:
                Left-side number for the multiple
                Right-side number
                Current answer
                Set of answers */

let score = 0;          /* Hold the score for the current set of problems for the user */
let setOfProblems = []; /* Hold the set of problems to be presented to the user        */
let problem = 1;
 

/* Generate a problem set containing 10 problems                    */
function generateProblemSet() {
    for(let i=0; i<10; i++) {
        /* Randomly generate a single multiplication problem        */
        /* Define a problem to hold the values we generate          */
        let problem = {
            left: getRandomNumber(9), /* should be a random value bt 0 & 9 */
            right: getRandomNumber(9),/* should be a random value bt 0 & 9 */
            currentAnswer: null,      /* right now, we don't know the correct answer */
        }
problem.correctAnswer = problem.left * problem.right; /* calculate the correct answer based on the randomNumber */
/* the set of answers needs to have the correct answer & 3 random other answers */
let setOfAnswers =
shuffleArray([problem.correctAnswer, getRandomNumber(81), getRandomNumber(81), getRandomNumber(81)])
/* randomize / shuffle the elements in the setOfAnswers so the correct answer is not always first */
setOfAnswers = shuffleArray(setOfAnswers)

        /* Add the problem to the problem set                       */
setOfProblems.push(problem,SetOfAnswers) }}
function displayProblem(){
const theProblem=document.getElementById('problem')
const problemExpression= '${setOfProblems[currentProblem-1].problem.left} *${setOfProblems[currentProblem-1].problem.right}'
theProblem.querySelectorStreamDefaultController('div.expression').innerText = problemExpression;


}

/* Generate a problem set containing 10 problems                    */
/* Randomly generate a single multiplication problem                */

function displayProblem(){
    const theProblem = document.getElementById('problem')

    //const problemExpression = ; /* left-side * right-side */

}
/* Show four randomly generated answers to the problem in a list across the page  */
/* determine the correct answer to the problem                      */
/* include the correct in the four answers displayed to the user    */
/* allow user to click on one of the answers displayed              */
/* Update the problem count when the user selects an answer         */
/* Determine if the answer chosen was correct                       */
/* update score if answer was correct                               */
/* Move/change to the next problem when user chooses and answer     */
/* Reset when the user wants to start over                          */
/* Have a utility function to generate random numbers for the problem and answers */
/* Have a utility function to randomize/sort the possible answers   */
/**
 * Utility function to generate a random number based on max
 * @param {number} max
 */
 function getRandomNumber(max) {


/**
 * Utility function to generate a random number based on max
 * @param {number} max
 */
 function getRandomNumber(max) {
    return Math.floor(Math.random() * Math.floor(max));
  }
  
  /**
   * Utility function to shuffle the items in an array
   * @param {object} arr
   */
  function shuffleArray(arr) {
    return arr.sort(function (a, b) { return Math.random() - 0.5 })
  }
  /*
  After the DOm has been fully loaded we want to start displaying our app*/
  document.addEventListener('DOMContentLoaded',() =>{
      generateProblemSet(); // generate a problem set
      displayProblem();})}     // display a problem