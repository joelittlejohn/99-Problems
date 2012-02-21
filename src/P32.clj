(defn gcd [a b] (if (zero? b) 
                  a 
                  (gcd b (mod a b))))


(gcd 36 63)
