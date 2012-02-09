(defn pack[s] (loop [head (first s) tail (rest s) current [] result []]
                (cond
                  (nil? head) result
                  (= head (first tail)) (recur (first tail) (rest tail) (conj current head) result)
                  (not= head (first tail)) (recur (first tail) (rest tail) [] (conj result (conj current head))))))

(defn encode[s] (for [x (pack s)] [(count x) (first x)]))

(encode ['a 'a 'a 'a 'b 'c 'c 'a 'a 'd 'e 'e 'e 'e])