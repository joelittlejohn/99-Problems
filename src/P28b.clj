(defn lsort-freq [s] 
  (reduce concat (vals (sort-by #(count (val %)) (group-by count s)))))

(lsort-freq [['a 'b 'c] ['d 'e] ['f 'g 'h] ['d 'e] ['i 'j 'k 'l] ['m 'n] ['o]])
(lsort-freq [])