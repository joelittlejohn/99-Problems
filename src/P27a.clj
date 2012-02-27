(use 'clojure.pprint)

(require 'P26)

(defn quad [pair triple s]
    (remove (set (concat pair triple)) s))

(defn triples [pair s]
  (combinations 3 (remove (set pair) s)))

(defn pairs [s]
  (combinations 2 s))

(defn group3 [s]
  (mapcat (fn [pair] (map (fn [triple] [pair triple (quad pair triple s)]) (triples pair s))) (pairs s)))

(pprint (group3 ["Aldo" "Beat" "Carla" "David" "Evi" "Flip" "Gary" "Hugo" "Ida"]))
(count (group3 ["Aldo" "Beat" "Carla" "David" "Evi" "Flip" "Gary" "Hugo" "Ida"]))
