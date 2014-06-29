(defproject {{sanitized}} "0.1.0"

  :description "{{sanitized}} - A Jruby based sinatra web application"

  :url ""

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.0.0"

  :plugins [[lein-libdir "0.1.1"]]

  :libdir-path "jars"

  :exclusions []

  :dependencies [[]]

  :profiles {:dev [org.clojure/cojure "1.5.1"]})