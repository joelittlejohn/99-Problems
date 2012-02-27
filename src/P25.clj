(require 'P23)

(defn random-permute [s]
  (random-select (count s) s))

(random-permute ['a 'b 'c 'd 'f])