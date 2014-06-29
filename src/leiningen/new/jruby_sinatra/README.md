# {{sanitized}}

## Useful commands

### Clean all java dependencies
    lein clean

### Resolve + clean all java dependencies
    lein do clean, deps

### Resolve all ruby deps
#### Developmend mode
    jruby -S bundle install --without nothing --no-deployment

#### Deployment mode
    jruby -S bundle install --deployment --binstubs --without development test

### Start local dev server
    rackup [-p <your port>]

### Create a war
    jruby -S bundle exec warble

## License

Copyright © 2014 FIXME

Distributed under FIXME