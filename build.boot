(set-env!
 :source-paths #{"src/cljs"}
 :resource-paths #{"html"}

 :dependencies '[[adzerk/boot-cljs "1.7.228-2"]
                 [pandeiro/boot-http "0.8.3"]]) 
(require '[adzerk.boot-cljs :refer[cljs]]
         '[pandeiro.boot-http :refer[serve]]
         )
