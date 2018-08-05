(require
  '[cljs.repl :as repl]
  '[cljs.repl.nashorn :as nashorn])

(repl/repl (nashorn/repl-env))
