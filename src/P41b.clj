(require 'P40)

(defn goldbach-list-limited [a b minprime]
  (filter #(> (second %) 50) (map #(cons % (goldbach %)) (filter #(and (even? %) (> % 2)) (range a (inc b))))))

(defn print-goldbach-list-limited [a b minprime]
  (mapcat #(println (str (first %) " = " (second %) " + " (last %))) (goldbach-list-limited a b minprime)))

(print-goldbach-list-limited 1 2000 50)