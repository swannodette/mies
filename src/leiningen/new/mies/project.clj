(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2511"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["out/{{sanitized}}" "{{sanitized}}.js"]

  :cljsbuild {
    :builds [{:id "{{name}}"
              :source-paths ["src"]
              :compiler {
                :output-to "{{sanitized}}.js"
                :output-dir "out"
                :optimizations :none
                :cache-analysis true                
                :source-map true}}]})
