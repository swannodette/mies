(ns leiningen.new.mies
  (:require [leiningen.new.templates :refer
             [renderer name-to-path ->files]]))

(def render (renderer "mies"))

(defn mies [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
      ["index.html" (render "index.html" data)]
      ["index_release.html" (render "index_release.html" data)]
      ["README.md" (render "README.md" data)]
      [".gitignore" (render "gitignore" data)]
      ["scripts/repl" (render "repl" data) :executable true]
	  ["scripts/repl.bat" (render "repl.bat" data)]
      ["scripts/repl.clj" (render "repl.clj" data)]
      ["scripts/brepl" (render "brepl" data) :executable true]
	  ["scripts/brepl.bat" (render "brepl.bat" data)]
      ["scripts/brepl.clj" (render "brepl.clj" data)]
      ["scripts/watch" (render "watch" data) :executable true]
	  ["scripts/watch.bat" (render "watch.bat" data)]
      ["scripts/watch.clj" (render "watch.clj" data)]
      ["scripts/build" (render "build" data) :executable true]
	  ["scripts/build.bat" (render "build.bat" data)]
      ["scripts/build.clj" (render "build.clj" data)]
      ["scripts/release" (render "release" data) :executable true]
	  ["scripts/release.bat" (render "release.bat" data)]
      ["scripts/release.clj" (render "release.clj" data)])))
