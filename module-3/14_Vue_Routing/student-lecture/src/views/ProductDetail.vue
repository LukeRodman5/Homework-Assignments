<template>
<div id='app' class='main'>
    <h1> {{product.name}}</h1>
    <p class='description'>{{product.description}}</p>
    <div class='well-display'><!-- display the summary of the ratings -->
        <average-summary />
        <star-summary rating= "1" />
        <star-summary rating= "2" />
        <star-summary rating= "3" />
        <star-summary rating= "4" />
        <star-summary rating= "5" />
    </div>
    <review-list />
</div>
</template>
<script>
    import AverageSummary from '@/components/AverageSummary.vue'
    import StarSummary from '@/components/StarSummary.vue'
    import ReviewList  from '@/components/REviewList.vue'
    export default {
    name: 'product-detail',
    components: {
        AverageSummary,
        StarSummary,
        ReviewList},
    created () {  // The created functions are run before the html is compiled by Vue
                // define a variable to hold the value from the id path variable
                // $route.params.variable-name is how you reference path variables in the URL
        const currentProductId = this.$route.params.id
                // get the value of the id variable in the URL
        this.$store.commit('SET_ACTIVE_PRODUCT', currentProductId)},
    computed:{    // Run there functions to crete attributedd when someting on the page is selected by the user
        product(){
                // .find() array method will create a new array form elements a function tells it you want
                // .find((currElemName) => { return true id current element should be in the new array})
                // use .find() to create an arrat form the products array in the data store
            return this.$store.state.products.find(  // get the data from the products array in the data store
            (aProduct) => {return aProduct.id == this.$store.state.activeProduct})
            }  // end of
        }  // end of computed section
    }  //end of export
</script>