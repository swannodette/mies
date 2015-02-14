(require '[cljs.closure :as cljsc])

(cljsc/watch "src"
  {:output-to "out/{{sanitized}}.js"
   :output-dir "release"
   :optimizations :advanced})
