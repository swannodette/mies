(ns leiningen.new.mies
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]))

(def render (renderer "mies"))

(defn mies [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
      ["index.html" (render "index.clj" data)])))
