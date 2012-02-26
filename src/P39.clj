(defn isprime? [n] (and (> n 1) 
                        (empty? (reduce (fn [factors x]
                                          (if (zero? (mod n x))
                                            (conj factors x)
                                            factors)) [] (range 2 n)))))

(defn list-primes-in-range [a b] 
  (filter isprime? (range a (inc b))))

(list-primes-in-range 7 31)