(defn remove-at[n s]
  [(keep-indexed #(if (not= n %1) %2) s) (nth s n nil)])

(defn remove-random[s]
  (remove-at (rand-nth (range 0 (count s))) s))

(defn random-select [n s]
  (take n (map last (iterate #(remove-random (first %1)) (remove-random s)))))

(random-select 3 ['a 'b 'c 'd 'f 'g 'h])