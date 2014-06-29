(ns leiningen.new.jruby-sinatra
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def ^{:const true} project-version "1.0.0-SNAPSHOT")

(def render (renderer "jruby-sinatra"))

(defn jruby-sinatra
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :clojure-version "1.5.1"
              :project-version project-version
              :jruby-version "jruby-1.7.8"}]

    (main/info "Generating fresh 'lein new' jruby-sinatra project" (:sanitized data))
    (->files data
             ; Dotfiles
             [".gitignote" (render "gitignore")]
             [".ruby-version" (render "ruby-version" data)]
             [".ruby-gemset" (render "ruby-gemset" data)]
             [".pryrc" (render "ruby/pryrc")]
             ["project.clj" (render "project.clj" data)]
             ; Readme
             ["README.md" (render "README.md" data)]
             ; Ruby files
             ["Gemfile" (render "ruby/Gemfile")]
             ["Rakefile" (render "ruby/Rakefile")]
             ["config.ru" (render "ruby/config.ru")]
             ["app/application_controller.rb" (render "ruby/application_controller.rb")]
             ["app/init.rb" (render "ruby/init.rb")]
             ["config/warble.rb" (render "ruby/warble.rb")])
    (main/info "All done! Croon away I say.")))