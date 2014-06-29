#rack.version: 1.5.2

root = File.expand_path(File.dirname(__FILE__))

# Add root and app directories to load path.
$:.unshift File.join(root)
$:.unshift File.join(root, 'app')
$:.unshift File.join(root, 'jars')

map '/' do
  run ApplicationController
end