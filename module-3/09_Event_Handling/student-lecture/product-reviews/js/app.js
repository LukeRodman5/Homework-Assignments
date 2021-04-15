const name = 'Cigar Parties for Dummies';
let description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
let reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * Once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  pageTitle.querySelector('.name').innerText = name;
}


// Add our product description to the page.
 
function setPageDescription() {
  document.querySelector('.description').innerText = description;
}

// I will display all of the reviews in the reviews array
 
function displayReviews() {
  // Use the template already defined in the html to add to the product review to the DOM
  if ('content' in document.createElement('template')) {  // If the html contains a template we are going to use it

    reviews.forEach((review) => {                         // We are going to use it
      displayReview(review);  // Loop though the array of reviews sending each review to anonymous function
    });
  } else {  // If there is no template in the html -display a message to that effect & do nothing else
    console.error('Your browser does not support templates');
  }
}

// @param {Object} review The review to display

function displayReview(review) { // Add a product review to the DOM using the pre-defined template in the html
  const main = document.getElementById('main'); // Get a reference to where we want to add the product review in the DOM
  const tmpl = document.getElementById('review-template').content.cloneNode(true); // Make a copy/clone of the template called a 'review-template'
  tmpl.querySelector('h4').innerText = review.reviewer; // Assign the reviewer property of current element
  tmpl.querySelector('h3').innerText = review.title; // Assign the title property of current element
  tmpl.querySelector( 'p').innerText = review.review; // Assign the review property of current element
  // There will always be 1 star because it is a part of the template
  for (let i = 1; i < review.rating; ++i) { // Loop to add any additional star images
    const img = tmpl.querySelector('img').cloneNode(); //   Make a copy of the image already in the template
    tmpl.querySelector('.rating').appendChild(img); //  Add it to div containing the stars
  }
  main.appendChild(tmpl); // Add the new product review <div> to the DOM
}

// LECTURE STARTS HERE ---------------------------------------------------------------

// Wait until the DOM is fully created before trying to manipulate it
// bc if the DOM is not fully created, the stuff we're adding may not be added

// Element-for-the-listener (event-to-handle, function-to-handle-the-event)
document.addEventListener('DOMContentLoaded', () => 
    { // Wait for the DOMContentLoaded event before we run the setup page function
      setPageTitle(); // Set the product reviews page title
      setPageDescription(); // Set the product reviews page description
      displayReviews(); // Display all of the product reviews on our page
      // Any additional event listeners will be added here, because they need to wait until the DOM is fully loaded too
                                                    
                                                    
                                                    
                                            
  const theDescription =document.querySelector('.description') // Get a reference to class='description'
        theDescription.addEventListener('Click', (event) =>    // call helper method with the element that was clicked
                                                               // .target is an attribute in the event object containing a reference that has an event
                                                            {toggleDescriptionEdit(event.target)
                                                            })                                          
  const theTextBox = document.getElementById('inputDesc')      // Get a reference to the text box             
        theTextBox.addEventListener('keyup',(event)=> {        // Check to see if the enter was pressed - event.key
    if(event.key === 'Enter') {
        exitDescriptionEdit(event.target,true)}                // call the helper with the element and the boolean to save
    if(event.key === 'Escape') {
        exitDescriptionEdit(event.target,false)} 
  }) // end of my anon-function for keyup                        



    }) // End of the anon-function for DOMContentLoaded Event Listener


const theAddReviewButton = document.getElementById('btnToggleForm');
      theAddReviewButton.addEventListener('click',() => {
        showHideForm;
      })

const theSaveReviewButton = document.getElementById('btnSaveReview');
      theSaveReviewButton.addEventListener('click',() =>{
  saveReview()
})
 // Run when a click event on the description and swap out the description for a text box.
 //
 // Swap the description on the page with a text box so the user can enter a new description
 // 
 // @param {Event} event that was clicked
 //

function toggleDescriptionEdit(desc) {  // Receive the element that was clicked as an argument
  const textBox = desc.nextElementSibling; // Get a reference to the next sibling of the element that was clicked
                                        // Get a reference to the <input> that follows the <p> which we 
  textBox.value = description;             // Initialize the textBox to the original description
  textBox.classList.remove('d-none');   // Allow the textBox to display by removing the d-none class
  // .classList contains all the classes assigned to an element - you can manipulate the list
  desc.classList.add('d-none');            // Hide the element that was clicked - adding the d-none class
  textBox.focus();                      // Put the cursor in the textBox
}

/**
 * Take an event on the text box and set the description to the contents
 * of the text box and then hide the text box and show the description.
 *
 * @param {Event} event the event object
 * @param {Boolean} save should we save the description text
 */
function exitDescriptionEdit(textBox, save) { // Received the element-that-had-the-event, boolean to save or not
  // if boolean is true we save the new text, false if we don't 
  
  let desc = textBox.previousElementSibling;  // Get a reference to sibling BEFORE the one having the event
                                              // IN this case, the <p> element for the description
  if (save) {                       
                                              // If the boolean passed was true
    desc.innerText = textBox.value;           
  }                                           // set the text in the previous sibling to the text entered
  textBox.classList.add('d-none');            // if the boolean is false, do nothing                                         
  desc.classList.remove('d-none');            // Display the description - removing d-none from class list 
}                                 

/**
 * I will show / hide the add review form
 */
function showHideForm() {
  const form = document.querySelector('form');
  const btn = document.getElementById('btnToggleForm');

  if (form.classList.contains('d-none')) {
    form.classList.remove('d-none');
    btn.innerText = 'Hide Form';
    document.getElementById('name').focus();
  } else {
    resetFormValues();
    form.classList.add('d-none');
    btn.innerText = 'Add Review';
  }
}

/**
 * I will reset all of the values in the form.
 */
function resetFormValues() {
  const form = document.querySelector('form');
  const inputs = form.querySelectorAll('input');
  inputs.forEach((input) => {
    input.value = '';
  });
  document.getElementById('rating').value = 1;
  document.getElementById('review').value = '';
}

/**
 * I will save the review that was added using the add review from
 */
function saveReview() {
  // get the information entered by the user - get a reference to the form or to each individual input field

const theName   = document.getElementById(  'name'  )
const theTitle  = document.getElementById(  'title' )
const theReview = document.getElementById( 'review' )
const theRating = document.getElementById( 'rating' )
const newReview = {
    reviewer: theName.value,
    title:    theTitle.value,
    review:   theReview.value,
    rating:   theRating.value,}
    reviews.push(newReview)
    displayReview(newReview)
}
  // save it to the reviews array by creating a new object for the new review
  // add the new object to the array
  //
}
