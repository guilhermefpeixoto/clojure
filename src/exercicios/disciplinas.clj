(ns exercicios.disciplinas)

(defn disciplinas
  []
  [{:nome "Estrutura de Dados" :semestre 2}
   {:nome "Algoritmos" :semestre 1}
   {:nome "Inteligência Artificial" :semestre 3}])

(defn mostra-disciplinas-restantes
  [disciplinas semestre]
  (map #(.toUpperCase (:nome %)) (filter #(>= (:semestre %) semestre) disciplinas)))
