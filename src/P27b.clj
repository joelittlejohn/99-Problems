(defn combinations [k s]
  (cond
    (> k (count s)) nil        ;not enough items in the sequence to form a valid combination
    (= k (count s)) [s]        ;only one combination available: all items 
    (= 1 k) (map vector s)     ;every item (on its own) is a valid combination
    :else (reduce concat (map-indexed 
            (fn [i x] (map #(cons x %) (combinations (dec k) (drop (inc i) s)))) 
            s))))

(defn group [ks s]
  (cond
    (= 1 (count ks)) (list (combinations (first ks) s))
    :else (mapcat (fn [x] (map #(cons x %) (group (rest ks) (remove (set x) s)))) (combinations (first ks) s))))

(pprint (group [2 2 5] ["Aldo" "Beat" "Carla" "David" "Evi" "Flip" "Gary" "Hugo" "Ida"]))
(count (group [2 2 5] ["Aldo" "Beat" "Carla" "David" "Evi" "Flip" "Gary" "Hugo" "Ida"]))