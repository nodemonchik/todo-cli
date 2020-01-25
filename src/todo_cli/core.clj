(ns todo-cli.core
  (:require [clojure.tools.cli :refer [cli]])
  (:gen-class))

(defn -main [& args]
  (def data (read-line))
  (def input (java.util.Scanner. data))
  (println (.next input)))
