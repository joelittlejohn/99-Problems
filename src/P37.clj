(use 'clojure.contrib.math)

(require 'P36)

(defn phi [n] (reduce 
                #(let [p (first %2) m (last %2)]
                   (* %1 (* (- p 1) (expt p (- m 1)))))
                1 (prime-factor-multiplicity n)))

(phi 315)