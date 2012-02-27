(require 'P09)

(defn encode-modified [s] (for [x (pack s)] 
                  (cond 
                    (= (count x) 1) (first x)
                    :else [(count x) (first x)])))

(encode-modified ['a 'a 'a 'a 'b 'c 'c 'a 'a 'd 'e 'e 'e 'e])