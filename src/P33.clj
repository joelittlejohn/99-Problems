(defn coprime [a b] (= 1 (if (zero? b) 
                           a 
                           (gcd b (mod a b)))))


(coprime 35 64)
(coprime 35 5)
