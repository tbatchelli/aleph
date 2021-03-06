(defproject aleph "0.1.0-SNAPSHOT"
  :description "an asynchronous web server"
  :repositories [["jboss" "http://repository.jboss.org/nexus/content/groups/public/"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
                     [autodoc "0.7.1"]]
  :dependencies [[org.clojure/clojure "1.2.0"] 
				 [org.clojure/clojure-contrib "1.2.0"]
                 [org.jboss.netty/netty "3.2.1.Final"]])
