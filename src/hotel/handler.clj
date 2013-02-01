(ns hotel.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(comment
	define servlet app-routes
)
(defroutes app-routes
  (GET "/" [] "Welcome To Rich Hickey Hotel")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))

(comment
(run-server {:port 8080}
            "/*" (servlet app-routes))
)