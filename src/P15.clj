(defn duplicate-n[n s] (mapcat #(replicate n %) s))

(duplicate-n 3 ['a 'b 'c 'c 'd])

(duplicate-n 3 [])