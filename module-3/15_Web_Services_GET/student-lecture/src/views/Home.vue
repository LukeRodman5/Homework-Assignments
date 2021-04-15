<!-- This is a router view referenced in an element of router configuration - in /router/index.js  -->
<!-- Typically a router view includes Vue components to be displayed -->

<template>
  <boards-list /> <!-- Use the BoardsList.vue component -->
</template> 

<script>
import BoardsList from '@/components/BoardsList'; // Gives us access to Vue component code we are using 
// in the export for a router view DO NOT CODE a name: attribute!
// the name attribute in the export is used by Vue to get data for a Vue component
// since all the router view does is connect a pathe to a Vue component - Vue component
// if you code a name: that happens to match a name: attribute for a component in use
// Vue will end up w/ a call stack exceeded error
export default {
  components: {   // this attribute lists the Vue components used by this router view
    BoardsList    // Name of the import for the Vue component (usually same as component name)
  }
};
</script>
