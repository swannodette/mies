(require '[cljs.closure :as cljsc])

(println "Building ...")

(let [start (System/nanoTime)]
  (cljsc/build "src"
    {:output-to "out/{{sanitized}}.js"
     :output-dir "release"
     :optimizations :advanced})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
