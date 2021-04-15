// This will tell Vue Router what paths it will handle & which views to display for those paths

import Vue from 'vue'         // Give me access to the Vue code
import VueRouter from 'vue-router' // Give me access to the Vue Router code
import Products from '@/views/Products.vue' // Include the Products.vue view code
import ProductDetail from '@/views/ProductDetail.vue'

Vue.use(VueRouter)            // We want to use the VueRouter for this app

const routes = [
  {                           // an element in routes is an object w/ the attributes of the route -associated
    path: '/',                // The URL path we want tp associate w/ a router view
    name: 'products',         // name for the path router view association
    component: Products       // view router component associated w/ the path -stored in the views folder
  },
  // We need to define a dynamic path that takes a path variable
  // a dynamic path has a path variable defined w/ a :variable-name
  {
    path: '/product/:id',      // This path has a path variable called it
    name: 'product-detail',      // name for the path-view association 
    component: ProductDetail   // name of the router view in the views folder
}
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router