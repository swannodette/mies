(ns {{name}}.core
  (:require [weasel.repl :as repl]))

(enable-console-print!)

(println "Hello world!")

(repl/connect "ws://localhost:9001" :verbose true)
