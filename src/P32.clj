(use 'clojure.set)

(defn divisors [n] (reduce (fn [factors x] 
                            (if (zero? (mod n x))
                              (conj factors x)
                              factors)) [] (range 2 (dec n))))

(defn gcd [a b] (last (intersection (set (divisors a)) (set (divisors b)))))


(gcd 36 63)
