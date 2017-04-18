(ns test-app.my-macros)

(defmacro normal-add [l]
  (list (second l) (first l) (last l)))
  
