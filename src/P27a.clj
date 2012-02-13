(defn combinations [k s]
  (cond
    (> k (count s)) nil        ;not enough items in the sequence to form a valid combination
    (= k (count s)) [s]        ;only one combination available: all items 
    (= 1 k) (map vector s)     ;every item (on its own) is a valid combination
    :else (reduce concat (map-indexed 
            (fn [i x] (map #(cons x %) (combinations (dec k) (drop (inc i) s)))) 
            s))))

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
