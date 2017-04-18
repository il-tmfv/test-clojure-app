(ns test-app.core
  (:require [test-app.my-macros :refer [normal-add]])
  (:require [test-app.dispatch :refer [dispatch add-action ->Action]])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  
  (add-action :test-action 
    (println "test action was dispatched, payload =" (:payload action))
    (println "====="))
  
  (add-action :default 
    (println "UNKNOWN action was dispatched, payload =" (:payload action)))
  
  (dispatch (->Action :test-action {:a 2 :b 3}))
  
  (dispatch (->Action :blabla {}))
  
  (println (normal-add (1 + 2))))
  

