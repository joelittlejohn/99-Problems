(defn pack[s] (loop [head (first s) tail (rest s) current [] result []]
                (cond
                  (nil? head) result
                  (= head (first tail)) (recur (first tail) (rest tail) (conj current head) result)
                  (not= head (first tail)) (recur (first tail) (rest tail) [] (conj result (conj current head))))))

(pack ['a 'a 'a 'a 'b 'c 'c 'a 'a 'd 'e 'e 'e 'e])
(pack [])