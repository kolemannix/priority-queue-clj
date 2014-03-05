(ns test.priority-queue
  (:require [priority-queue :refer :all]
            [midje :refer :all]))

(defchecker priority-queue? [actual-result]
  (instance? java.util.PriorityQueue actual-result))

(defchecker empty? [actual-result]
  (= 0 (count actual-result)))

(fact "Queue can be created"
  (create) =>
  (every-checker priority-queue? empty?))
