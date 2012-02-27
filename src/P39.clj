(require 'P31)

(defn list-primes-in-range [a b] 
  (filter isprime? (range a (inc b))))

(list-primes-in-range 7 31)