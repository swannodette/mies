@echo off
lein trampoline run -m clojure.main -e "(compile 'cljs.repl.node) (compile 'cljs.repl.browser) (compile 'cljs.core)"

