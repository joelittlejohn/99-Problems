(require 'P35)

(defn prime-factor-multiplicity [n] (frequencies (prime-factors n)))

(prime-factor-multiplicity 315)
