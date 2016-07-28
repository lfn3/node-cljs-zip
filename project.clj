(defproject lambda-zipper "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript  "1.8.34"]
                 [io.nervous/cljs-nodejs-externs "0.1.0"]]

  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-npm       "0.6.2"]]

  :npm {:dependencies [[source-map-support "0.2.8"]
                       [jszip "3.0.0"]]}
  :cljsbuild
  {:builds [{:id "main"
             :source-paths ["src"]
             :compiler {:output-to     "zipper.js"
                        :target        :nodejs
                        :hashbang      false
                        :optimizations :simple
                        :source-map    "zipper.map.js"}}]})
