(ns priority-queue
  (:import (java.util PriorityQueue)))

(clear (insert (create) 4))

(defn create
  ([] (PriorityQueue.))
  ([initial-capacity] {:pre [(integer? initial-capacity)
                             (pos? initial-capacity)]} (PriorityQueue. initial-capacity)))

(defn insert [queue e]
  (.add queue e)
  queue)

(defn offer [queue e]
  (.offer queue e)
  queue)

(defn clear [queue]
  (.clear queue)
  queue)

(defn contains? [queue e]
  (.contains queue e))

(defn peek [queue]
  (.peek queue))

(defn remove [queue e]
  (.remove queue e)
  queue)
