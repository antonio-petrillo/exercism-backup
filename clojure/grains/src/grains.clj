(ns grains)

(defn square [cell]
  (.shiftLeft BigInteger/ONE (dec cell)))

(defn total []
  (dec (square 65)))
