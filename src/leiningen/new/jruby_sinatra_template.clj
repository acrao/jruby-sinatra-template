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
             [".gitignote"
                (render "gitignore")
              "project.clj"
                (render "project.clj" data)
              "README.md"
                (render "README.md" data)
              "src/{{sanitized}}/app/Gemfile"
                (render "ruby/Gemfile" data)
              "src/{{sanitized}}/app/Rakefile"
                (render "ruby/Rakefile" data)
              "src/{{sanitized}}/app/application_controller.rb"
                (render "ruby/application_controller.rb.rb")
              "src/{{sanitized}}/config/warble.rb"
                (render "ruby/warble.rb")
              ]
    )
  )
)
