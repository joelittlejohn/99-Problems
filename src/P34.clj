(require 'P33)

(defn totient [a] (count (filter #(coprime a %) (range 1 a))))

(totient 10)
