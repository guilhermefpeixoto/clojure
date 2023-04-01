(ns exercicios.disciplinas_threading_last
  (:require [clojure.string :refer [join]]))

(defn disciplinas
  []
  [{:nome "Estrutura de Dados" :semestre 2}
   {:nome "Algoritmos" :semestre 1}
   {:nome "Inteligência Artificial" :semestre 3}])

(defn mostra-disciplinas-restantes
  [disciplinas semestre]
  (->> disciplinas
       (filter #(>= (:semestre %) semestre))
       (map #(.toUpperCase (:nome %)))
       (join ", ")))
