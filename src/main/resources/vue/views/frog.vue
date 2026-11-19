<template id="frog">
  <h1 class="header">I am a frog. </h1>
  <p class="paragraph">Ribbit. Ribbit. Ribbit. Ribbit. Ribbit. </p>
</template>
<script>
  app.component("frog", {template : "#frog"});
</script>
<style>
  .header {
    color: forestgreen;
  }
  .paragraph {
    color: mediumspringgreen;
  }
  html {
    background-color: darkslategrey;
  }
</style>