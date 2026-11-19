<template id="home">
  <frog-style></frog-style>
  <h1>Welcome to FrogWorld!</h1>
  <p>We have the following sites:</p>
  <ul>
    <li><a href="/hello">hello</a></li>
    <li><a href="/frog">frog</a></li>
    <li><a href="/todo">todo</a></li>
  </ul>
</template>
<script>app.component("home", {template: "#home"});</script>
<style>
  ul li {
    color: var(--frog-fg-link);
  }
</style>