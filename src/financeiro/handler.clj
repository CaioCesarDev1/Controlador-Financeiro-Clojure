(ns financeiro.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Ola mundo")
  (route/not-found "Recurso não encontrado"))

(def app
  (wrap-defaults app-routes site-defaults))
