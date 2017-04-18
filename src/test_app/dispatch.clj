(ns test-app.dispatch)

(defrecord Action [type payload])

(defmulti dispatch (fn [action] (:type action)))

(defmacro add-action [type & body]
  `(defmethod dispatch ~type ~(vector 'action) ~@body))
