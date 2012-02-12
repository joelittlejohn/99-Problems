(defn remove-at[n s] [(keep-indexed #(if (not= n %1) %2) s) (nth s n nil)])

(remove-at 1 ['a 'b 'c 'd])
(remove-at 1 [])