<template>
  <div></div>
</template>

<script>
import from '../services/BoardService'
export default {
  name: "card-detail",
  data() {
    return {
      cards: [] // Hold the date displayed on this data
    } // end of return
  },  // end of data ()
      // We need the data for the page before Vue generates the html
      // so we will get data in a created () hook
  created(){
      // call the getCards() in boardService w/ the current boardID to get the data
      // the boardID is in the pather - use this.$route.variableName
      // getCards () returns a promise from the API call to tell us when it's done
      //      so we .then() to wait for the API call to be done
      //      so we can access the data from the response
boardService.getCards(this.$route.params.boardID).then(response => {
this.cards = response.data.cards
    }) 
  }
};
</script>
