(ns financeiro.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [cheshire.core :as json]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Ola mundo")
  (GET "/saldo" [] {:headers {"Content-Type"
                              "application/json; charset=utf-8"}
                    :body (json/generate-string {:saldo 0})})
  (route/not-found "Recurso não encontrado"))

(def app
  (wrap-defaults app-routes site-defaults))
