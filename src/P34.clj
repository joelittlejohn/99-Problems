(defn coprime [a b] (= 1 (if (zero? b) 
                           a 
                           (gcd b (mod a b)))))

(defn totient [a] (count (filter #(coprime a %) (range 1 a))))

(totient 10)
