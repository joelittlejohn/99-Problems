(require 'P40)

(defn print-goldbach-list [a b] (mapcat #(println (str % " = " (goldbach %))) (filter even? (range a (inc b)))))

(print-goldbach-list 9 20)