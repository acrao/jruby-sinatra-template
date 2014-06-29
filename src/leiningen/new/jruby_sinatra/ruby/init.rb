require 'java'

root = File.expand_path(Dir.pwd)

# Require all java jars.
Dir["#{root}/jars/**/*.jar"].each do |jar|
  require jar
end