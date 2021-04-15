<template>
  <table>
    <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th># Reviews</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="product in $store.state.products" v-bind:key="product.id">
        <td>{{ product.id }}</td>

        <!-- We need to link a new page when the name is clicked                     -->
        <!-- to do that we need to ass a router link to the description              -->
        <!-- <router-link defines a link for the vue router to handle                -->
        <!--      v-bind:to="" identifies the pouter path you want vue router to use -->
        <!--              name='router-path-name in the v-bind:to=""                 -->
  <td>
    <router-link v-bind:to="{name: 'product-detail', params:{id: product.id}}">
      {{ product.name }}
    />
  </td>
        <td>{{ product.reviews.length }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: "products-list"
};
</script>

<style style="scoped">
th,
td {
  text-align: left;
}
td {
  padding-right: 10px;
  vertical-align: top;
}
tr:nth-child(even) {
  background-color: rgb(238, 238, 238);
}
</style>
