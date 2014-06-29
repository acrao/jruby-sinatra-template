(defproject jruby-sinatra/lein-template "0.1.0"
  :description "Leiningen template for a Sinatra web app that runs on the Jruby platform"
  :url "https://github.com/acrao/jruby-sinatra-template"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/acrao/jruby-sinatra-template"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :pom-addition [:developers [:developer
                              [:name "Aditya Rao"]
                              [:url "http://adityacrao.com"]
                              [:email "username@users.noreply.github.com"]
                              [:timezone "-8"]]]
  :eval-in-leiningen true)