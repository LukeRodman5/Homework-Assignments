
import axios from 'axios';  // Access the axios API framework for HTTP REst API calls

const http = axios.create({ // Instantiate an axios object
  baseURL: "http://localhost:3000"  // w/ the URL for the server we want to access
});

export default {  // Expose the stuff in here to outside processes
                  // Use interpolation (` `) to create a string containing values from a variable
                  // Use single quotes (' ') to create a string containing no values from variables

                  // Axios .get(path-to-the-API-as-a-string)

  getBoards() {
    return http.get('/boards');           // Do a REST API GET request to the path specified
  },                                      // include the value passed as a path variable

  getCards(boardID) {
    return http.get(`/boards/${boardID}`) // Do a REST API GET request to the path specified
  },                                      // include the value passed as a path variable
  
  getCard(cardID) {
    return http.get(`/cards/${cardID}`)   // Do a REST API GET request to the path specified
  },                                      // include the value passed as a path variable
  
  // Axios knows to take the data you give it in a post & put it in the request body
  // Axios .post(path-as-a-string, data-to-be-posted)
  // REST API protocol says put the key of the resource to update as a path variable in a GET
  addCard(card) {
    return http.post('/cards', card);     // Do a REST API POST to the path specified w/ the data to be posted
  },                                      // include the value passed as the data to be posted

  // Axios .put(path-as-a-string, data-to-be-posted)
  // REST API protocol says put the key of the resource to update as a path variable in a PUT
  updateCard(card) {
    return http.put(`/cards/${card.id}`, card); // Do a REST API PUT to the path specified w/ the id as a path variable
  },                                            // include the value passed as the data to be posted
  // REST API protocol says put the key of the resource to delete as a path variable
  deleteCard(cardID) {
    return http.delete(`/cards/${cardID}`);     // Do a REST API DELETE to the path specified w/ the data passed as a path variable
  }
}
