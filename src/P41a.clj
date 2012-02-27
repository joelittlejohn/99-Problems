(require 'P40)

(defn print-goldbach-list [a b] (mapcat 
                                  #(let [g (goldbach %)] (println (str % " = " (first g) " + " (second g)))) 
                                  (filter even? (range a (inc b)))))

(print-goldbach-list 9 20)