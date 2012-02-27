(require 'P09)

(defn encode [s] (for [x (pack s)] [(count x) (first x)]))

(encode ['a 'a 'a 'a 'b 'c 'c 'a 'a 'd 'e 'e 'e 'e])