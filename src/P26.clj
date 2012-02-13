(defn combinations [k s]
  (cond
    (> k (count s)) nil        ;not enough items in the sequence to form a valid combination
    (= k (count s)) [s]        ;only one combination available: all items 
    (= 1 k) (map vector s)     ;every item (on its own) is a valid combination
    :else (reduce concat (map-indexed 
            (fn [i x] (map #(cons x %) (combinations (dec k) (drop (inc i) s)))) 
            s))))


(combinations 3 ['a 'b 'c 'd 'f])
(count (combinations 3 ['a 'b 'c 'd 'f]))

(combinations 3 ['a 'b 'c 'd 'f 'g 'h 'i 'j 'k 'l 'm 'n 'o 'p 'q 'r 's 't 'u 'v 'w 'x 'y 'z])
(count (combinations 3 ['a 'b 'c 'd 'f 'g 'h 'i 'j 'k 'l 'm 'n 'o 'p 'q 'r 's 't 'u 'v 'w 'x 'y 'z]))