(use 'clojure.pprint)

(require 'P26)

(defn group [ks s]
  (cond
    (= 1 (count ks)) (list (combinations (first ks) s))
    :else (mapcat (fn [x] (map #(cons x %) (group (rest ks) (remove (set x) s)))) (combinations (first ks) s))))

(pprint (group [2 2 5] ["Aldo" "Beat" "Carla" "David" "Evi" "Flip" "Gary" "Hugo" "Ida"]))
(count (group [2 2 5] ["Aldo" "Beat" "Carla" "David" "Evi" "Flip" "Gary" "Hugo" "Ida"]))