// This is created from options specified when you do vue create command

import Vue from 'vue'         // Access the code to support Vue
import App from './App.vue'   // Access the code for main page App.vue
import store from './store'   //
import router from './router' //

Vue.config.productionTip = false

new Vue({
  store,
  router,
  render: h => h(App)
}).$mount('#app')
