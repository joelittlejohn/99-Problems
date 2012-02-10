(defn drop-every[n s] (keep-indexed #(if-not (zero? (mod (inc %1) n)) %2) s))

(drop-every 3 ['a 'b 'c 'd 'e 'f 'g 'h 'i 'j 'k])

(drop-every 3 [])