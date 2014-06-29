(defproject {{sanitized}} "{{project-version}}"

  :description "{{sanitized}} - A Jruby based sinatra web application"

  :url ""

  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.0.0"

  :plugins [[lein-libdir "0.1.1"]
            [lein-shell "0.4.0"]]

  :libdir-path "jars"

  :aliases {"remove-jars" ["shell" "rm" "-rf" "jars"]
            "clean" ["do" "clean," "remove-jars"]
            "deps"  ["do" "deps," "libdir"]}

  ;:exclusions []

  ;:dependencies [[]]

  :profiles {:dev {:dependencies [[org.clojure/clojure "{{clojure-version}}"]]}})