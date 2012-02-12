(defn combinations [n s]
  (cond
    (> n (count s)) nil
    (= n (count s)) [s]
    (= 1 n) (map vector s)
    :else (reduce concat (map-indexed 
            (fn [i x] (map #(cons x %) (combinations (dec n) (drop (inc i) s)))) 
            s))))

(combinations 3 ['a 'b 'c 'd 'f])