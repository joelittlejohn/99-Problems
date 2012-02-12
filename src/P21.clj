(defn insert-at[x n s] (concat (take n s) [x] (drop n s)))

(insert-at 'new 1 ['a 'b 'c 'd])
(insert-at 'new 1 [])