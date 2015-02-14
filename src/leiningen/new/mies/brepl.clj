(require
  '[cljs.repl :as repl]
  '[cljs.repl.browser :as browser])

(repl/repl* (browser/repl-env)
  {:watch "src"
   :output-dir "out"
   :optimizations :none
   :cache-analysis true                
   :source-map true})
