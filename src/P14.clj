(defn duplicate[s] (mapcat #(replicate 2 %) s))

(duplicate ['a 'b 'c 'c 'd])

(duplicate [])