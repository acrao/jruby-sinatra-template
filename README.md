# jruby-sinatra lein template

```jruby-sinatra-template``` is a [Leiningen](http://leiningen.org/) template for
Sinatra web applications that run primarily on the Jruby platform.

## Installation

You will need to install [Leiningen](http://leiningen.org/) to use the template. Installation
instruction can be found [here](https://github.com/technomancy/leiningen#installation)

Once you have [leiningen](http://leiningen.org/) installed and in your ```$PATH```,
then you'd need to add the following to ```~/.lein/profiles.clj```

    {:user {:plugins [[jruby-sinatra/lein-template "0.1.0"]]}}

## Usage

    # Create a new project
    lein new jruby-sinatra my-new-web-app

    # Resolve all dependencies (java + ruby)
    cd my-new-web-app && lein do clean, deps && bundle install

## App structure

    $ tree -a
    .
    ├── .gitignote
    ├── .pryrc
    ├── .ruby-gemset
    ├── .ruby-version
    ├── Gemfile
    ├── Gemfile.lock
    ├── README.md
    ├── Rakefile
    ├── app
    │   ├── application_controller.rb
    │   └── init.rb
    ├── config
    │   └── warble.rb
    ├── config.ru
    ├── jars
    │   ├ ...
    │
    ├── project.clj
    └── target
        └ ...

## Useful commands

#### Clean all java dependencies
    lein clean

#### Resolve + clean all java dependencies
    lein do clean, deps

#### Resolve all ruby deps
##### Developmend mode
    jruby -S bundle install --without nothing --no-deployment

##### Deployment mode
    jruby -S bundle install --deployment --binstubs --without development test

#### Start local dev server
    rackup [-p <your port>]

#### Create a war
    jruby -S bundle exec warble

## License

Copyright © 2014 Aditya Rao

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
