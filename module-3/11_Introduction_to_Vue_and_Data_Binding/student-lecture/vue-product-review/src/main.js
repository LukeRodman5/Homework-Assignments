// This is an automatically generated by the vue create command &  probably never have to change anything in here
// vue uses this to inject our vue components into the index.html

import Vue from 'vue'          // give me to access the vue stuff
import App from './App.vue'     // give me to access the app.vue component
Vue.config.productionTip = false // disable hints about vue for the app
new Vue({                      // instantiate a vue application object
  render: h => h(App),       // render tells vue what the main components is called - must match the name of an import
}).$mount('#app')          // $mount - tells vue where in the index.html the vue components should be added
                        // #app - the element w/ id='app' will have the vue components added to it
