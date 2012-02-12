(defn rotate[n s] (cond 
                    (neg? n) (concat (take-last (- n) s) (drop-last (- n) s))
                    :else (concat (drop n s) (take n s))))

(rotate 3 ['a 'b 'c 'd 'e 'f 'g 'h 'i 'j 'k])

(rotate -2 ['a 'b 'c 'd 'e 'f 'g 'h 'i 'j 'k])

(rotate 3 [])