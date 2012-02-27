(require 'P39)

(defn goldbach [x] (loop [primes (list-primes-in-range 1 x)]
                     (cond
                       (isprime? (- x (first primes))) [(first primes) (- x (first primes))]
                       :else (recur (rest primes)))))

(goldbach 30)