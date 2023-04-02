(defn revela-imc
  [peso altura]
  (let [imc (/ peso (* altura altura))]
  (if (< imc 18.5)
    :baixo-peso
    (if (< imc 24.9)
      :peso-ideal
      :acima-peso))))