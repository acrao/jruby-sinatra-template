require 'sinatra/base'

class ApplicationController < Sinatra::Base

  get '/healthz' do
    [200, {}, ['healthz']]
  end

end