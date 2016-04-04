(defproject org.clojars.hakonki/valip "0.4.0-SNAPSHOT"
  :description "Functional validation library for Clojure and ClojureScript.
                Forked from https://github.com/cemerick/valip"
  :url "http://github.com/hakonki/valip"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[cider/cider-nrepl "0.9.1"]]
  :clean-targets ^{:protect false} ["resources" "dev-resources" :target-path])
