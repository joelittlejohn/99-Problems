(defn isprime? [n] (and (> n 1) 
                        (empty? (reduce (fn [factors x]
                                          (if (zero? (mod n x))
                                            (conj factors x)
                                            factors)) [] (range 2 n)))))

(defn list-primes-in-range [a b] 
  (filter isprime? (range a (inc b))))

(defn goldbach [x] (loop [primes (list-primes-in-range 1 x)]
                     (cond
                       (isprime? (- x (first primes))) [(first primes) (- x (first primes))]
                       :else (recur (rest primes)))))

(goldbach 30)