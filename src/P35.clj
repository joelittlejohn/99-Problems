(defn isprime? [n] (and (> n 1) 
                        (empty? (reduce (fn [factors x]
                                          (if (zero? (mod n x))
                                            (conj factors x)
                                            factors)) [] (range 2 n)))))

(defn prime-factors [n] (if (isprime? n)
                          (list n)
                          (let [lowest-prime-factor (first (filter #(zero? (mod n %)) (filter isprime? (range 2 n))))]
                            (cons lowest-prime-factor (prime-factors (/ n lowest-prime-factor))))))

(prime-factors 316)
(prime-factors 9)
(prime-factors 7)
