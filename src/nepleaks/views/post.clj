(ns nepleaks.views.post
	(:use [hiccup core page]
	      [clj-http.client :as client]
              [nepleaks.conf.server :as server]
              [nepleaks.conf.nlp    :as nlp]
              )
)

(comment
	define views
)

;;TODO render json here

(defn getJsonResponse []
  (println "getJsonResponse") ;;FIXME replace it with logger
  ;;(println apply str (server/getEsMapping))
  (nlp/speak "I'm Prayag")
)

(getJsonResponse)

(defn index []
  (html5
    [:head
      [:title "nepleaks.org"]
    ]
    [:body
     [:h1 "A leaks pool"]
     [:p (getJsonResponse)]
     ;;FIXME [:p "nepleaks"]
     ]))

