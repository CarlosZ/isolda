({
  baseUrl: "./web-app/js/src/",
  dir: "web-app/js/pkg/",
  optimizeCss: "none",
  modules: [
    {
      name: "main",
      exclude: [
        "../lib/require.js"
      ]
    }
  ]
})
