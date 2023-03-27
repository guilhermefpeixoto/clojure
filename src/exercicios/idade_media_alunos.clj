(ns exercicios.idade_media_alunos)

(defn conta-estudantes-ano
  [estudantes ano-desejado]
  (count (filter #(= ano-desejado %) estudantes)))

(defn soma-das-idades
  [idades]
  (reduce + idades))

(defn tamanho-medio-nomes
  [nomes]
  (/ (reduce + (map count nomes)) (count nomes)))