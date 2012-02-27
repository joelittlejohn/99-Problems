(require 'P22)

(require 'P23)

(defn lotto [n highest] (random-select n (irange 1 highest)))

(lotto 6 49)