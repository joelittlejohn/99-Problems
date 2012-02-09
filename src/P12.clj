(defn decode[s] (loop [head (first s) tail (rest s) result []] 
                  (cond 
                    (nil? head) result
                    (coll? head) (recur (first tail) (rest tail) (into result (repeat (first head) (last head))))
                    :else (recur (first tail) (rest tail) (conj result head)))))

(decode [[4 'a] 'b [2 'c] [2 'a] 'd [4 'e]])

(decode [])