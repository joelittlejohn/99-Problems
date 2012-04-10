(defn not [a] 
  (if a false true))

(defn and [a b]
  (if a b false))

(defn or [a b]
  (if a true b))

(defn nand [a b]
  (not (and a b)))

(defn nor [a b]
  (not (or a b)))

(defn xor [a b]
  (or (and a (not b)) (and (not a)  b)))

(defn impl [a b]
  (or (not a) b))

(defn equ [a b]
  (= a b))

(defn table2 [f] 
  (do (println "A     B     result")
    (doall (mapcat #(printf "%-5s %-5s %s\n"  (first %) (second %) (f (first %) (second %))) (for [a [true false] b [true false]] [a b])))))

(table2 and)
(table2 or)
(table2 nand)
(table2 nor)
(table2 xor)
(table2 impl)
(table2 equ)