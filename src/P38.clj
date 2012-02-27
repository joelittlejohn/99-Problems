(require 'P34)

(require 'P36)

(defn phi [n primes] (reduce 
                #(let [p (first %2) m (last %2)]
                   (* %1 (* (- p 1) ('clojure.contrib.math/expt p (- m 1)))))
                1 primes))

(time (totient 10090)) 

;total phi time, include calculation of primes
(time (phi 10090 (prime-factor-multiplicity 10090)))

;phi time with pre-calculated primes
(let [primes (prime-factor-multiplicity 10090)] (time (phi 10090 primes)))
