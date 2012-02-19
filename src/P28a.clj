(defn lsort [s] 
  (sort-by #(count %) s))

(lsort [['a 'b 'c] ['d 'e] ['f 'g 'h] ['d 'e] ['i 'j 'k 'l] ['m 'n] ['o]])