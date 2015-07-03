(require '[cljs.build.api :as b])

(b/watch "src"
  {:main '{{name}}.core
   :output-to "out/{{sanitized}}.js"
   :output-dir "out"})
