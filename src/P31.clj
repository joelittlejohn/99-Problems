(defn isprime? [n] (and (> n 1) 
                        (empty? (reduce (fn [factors x]
                                          (if (zero? (mod n x))
                                            (conj factors x)
                                            factors)) [] (range 2 n)))))

(isprime? 1)
(isprime? 7)
(isprime? 2)
(isprime? 12)
(isprime? 9)