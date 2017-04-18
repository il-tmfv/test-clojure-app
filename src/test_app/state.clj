(ns test-app.state)

(def state (agent {:counter 0}))

(add-watch state :counter-watch (fn [k r old-state new-state]
                                  (println "Counter changed" (:counter old-state) "to" (:counter new-state))))
