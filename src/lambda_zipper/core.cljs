(ns lambda-zipper.core
  (:require [cljs.nodejs :as nodejs]))

(def jszip (js/require "jszip"))
(def fs (js/require "fs"))

(nodejs/enable-util-print!)

(defn zip-lambda-fn [path]
  (.readFile fs path (fn [err data]
                       (if err
                         err
                         (-> (jszip.)
                             (.file "test.js" data)
                             (.generateAsync (clj->js {:type "base64"}))
                             (.then #(prn %1))
                             (.catch #(prn %1)))))))

(defn -main [& args]
  (let [_ (zip-lambda-fn (first args))]))

(set! *main-cli-fn* -main)




