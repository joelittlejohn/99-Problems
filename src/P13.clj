(defn encode[s] (loop [head (first s) tail (rest s) current [0 (first s)] result []]
                (cond
                  (nil? head) result
                  (= head (first tail)) (recur (first tail) (rest tail) [(inc (first current)) head] result)
                  (not= head (first tail)) (recur (first tail) (rest tail) [0 (first tail)] (conj result [(inc (first current)) head])))))

(encode ['a 'a 'a 'a 'b 'c 'c 'a 'a 'd 'e 'e 'e 'e])

(encode [])