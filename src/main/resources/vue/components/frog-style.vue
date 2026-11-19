<template id="frog-style">
    <slot></slot>
</template>
<script>app.component("frog-style", {template: "#frog-style"});</script>
<style>
:root {
  --frog-bg-color1: darkslategray;
  --frog-bg-color2: #3a7862;
  --frog-fg-color1: lightgreen;
  --frog-fg-color2: lawngreen;
}

html {
  background-color: var(--frog-bg-color1);

  & p {
    color: var(--frog-fg-color1);
  }

  & h1 {
    color: var(--frog-fg-color2);
  }
}
</style>