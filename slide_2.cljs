(ns lt.plugins.sile_2
  (:require [lt.object :as object])
  (:require-macros [lt.macros :refer [behavior]]))


(+ 2 2)



(def add-2 (partial + 2))


(add-2 4)
(add-2 2)



