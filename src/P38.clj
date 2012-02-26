(use 'clojure.contrib.math)

(defn coprime [a b] (= 1 (if (zero? b) 
                           a 
                           (gcd b (mod a b)))))

(defn totient [a] (count (filter #(coprime a %) (range 1 a))))

(defn isprime? [n] (and (> n 1) 
                        (empty? (reduce (fn [factors x]
                                          (if (zero? (mod n x))
                                            (conj factors x)
                                            factors)) [] (range 2 n)))))

(defn prime-factors [n] (if (isprime? n)
                          (list n)
                          (let [lowest-prime-factor (first (filter #(zero? (mod n %)) (filter isprime? (range 2 n))))]
                            (cons lowest-prime-factor (prime-factors (/ n lowest-prime-factor))))))

(defn prime-factor-multiplicity [n] (frequencies (prime-factors n)))

(defn phi [n primes] (reduce 
                #(let [p (first %2) m (last %2)]
                   (* %1 (* (- p 1) (expt p (- m 1)))))
                1 primes))

(time (totient 10090)) 

;total phi time, include calculation of primes
(time (phi 10090 (prime-factor-multiplicity 10090)))

;phi time with pre-calculated primes
(let [primes (prime-factor-multiplicity 10090)] (time (phi 10090 primes)))
