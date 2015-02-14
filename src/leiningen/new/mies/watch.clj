(require '[cljs.closure :as cljsc])

(cljsc/watch "src"
  {:main '{{name}}.core
   :output-to "out/{{sanitized}}.js"
   :output-dir "out"
   :optimizations :none
   :cache-analysis true
   :source-map true})
