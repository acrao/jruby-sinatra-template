#rack.version: 1.5.2

root = File.expand_path(File.dirname(__FILE__))

# Add root and app directories to load path.
add_paths = [root,
             File.join(root, 'app'),
             File.join(root, 'jars'),
             File.join(root, 'lib')]
add_paths.each do |path|
  $: << path unless $:.include?(path)
end

$:.unshift File.join(root)
$:.unshift
$:.unshift File.join(root, 'jars')

require 'application_controller'

map '/' do
  run ApplicationController
end