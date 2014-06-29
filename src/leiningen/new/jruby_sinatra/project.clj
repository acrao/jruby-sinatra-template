(defproject {{sanitized}} "{{project-version}}"

  :description "{{sanitized}} - A Jruby based sinatra web application"

  :url ""

  :min-lein-version "2.0.0"

  :plugins [[lein-libdir "0.1.1"]
            [lein-shell "0.4.0"]]

  :libdir-path "jars"

  :aliases {"remove-jars" ["shell" "rm" "-rf" "jars"]
            "clean" ["do" "clean," "remove-jars"]
            "deps"  ["do" "deps," "libdir"]}

  ; Global exclusions
  ;:exclusions []

  ; Java dependencies. For example : 
  ;:dependencies [[org.slf4j/slf4j-api "1.6.2"]
  ;               [org.slf4j/slf4j-log4j12 "1.6.2"]
  ;               [org.apache.thrift/libthrift "0.9.0"]]

  :profiles {:dev {:dependencies [[org.clojure/clojure "{{clojure-version}}"]]}})
