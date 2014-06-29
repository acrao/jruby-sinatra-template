(ns leiningen.new.jruby-sinatra-template
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "jruby-sinatra-template"))

(defn jruby-sinatra-template
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' jruby-sinatra-template project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
