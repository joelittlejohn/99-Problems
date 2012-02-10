(defn slice[a b s] (take (- b a) (drop a s)))

(slice 3 7 ['a 'b 'c 'd 'e 'f 'g 'h 'i 'j 'k])

(slice 3 7 [])