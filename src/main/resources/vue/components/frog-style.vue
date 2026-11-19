<template id="frog-style"></template>
<script>app.component("frog-style", {template: "#frog-style"});</script>
<style>
:root {
  --frog-bg-color1: #294339;
  --frog-bg-color2: #396a58;
  --frog-bg-color3: #458a5b;
  --frog-fg-color1: lightgreen;
  --frog-fg-color2: lawngreen;
  --frog-fg-color3: #c6f348;
  --frog-fg-link: lightseagreen;
}

html {
  background-color: var(--frog-bg-color1);

  & p {
    color: var(--frog-fg-color1);
  }

  & li {
    color: var(--frog-fg-color1);
  }

  & h1 {
    color: var(--frog-fg-color2);
  }

  & a {
    color: var(--frog-fg-link);
  }
}
</style>