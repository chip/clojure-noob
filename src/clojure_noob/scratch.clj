; (loop [iteration 0]
;   (println (str "Iteration " iteration))
;   (if (> iteration 3)
;     (println "Goodbye!")
;     (recur (inc iteration))))

; (defn recursive-printer
;   ([]
;      (recursive-printer 0))
;   ([iteration]
;      (println iteration)
;      (if (> iteration 3)
;        (println "Goodbye!")
;        (recursive-printer (inc iteration)))))
; (recursive-printer)

; (defn add-hundred
;   [x]
;   (if (number? x)
;     (+ 100 x)
;     (+ 100 (biginteger x))))
; ; (add-hundred 2)

; (defn fruits-vector
;   [fruits]
;   (vector fruits))

; (defn fruits-list
;   [fruits]
;   (list fruits))

; (defn dec-maker
;   "Create a custom decrementor"
;   [dec-by]
;   #(- % dec-by))

; (def dec3 (dec-maker 3))

; (dec3 1)

; (defn hay-join
;   "Create hay out of a stacktrace"
;   [hay]
;   #(join % hay))

; (defn hay-maker (hay-join "makeeeeer"))

; (hay-maker)

(def vampire-database
  {0 {:makes-blood-puns? false, :has-pulse? true  :name "McFishwich"}
   1 {:makes-blood-puns? false, :has-pulse? true  :name "McMackson"}
   2 {:makes-blood-puns? true,  :has-pulse? false :name "Damon Salvatore"}
   3 {:makes-blood-puns? true,  :has-pulse? true  :name "Mickey Mouse"}})

(defn vampire-related-details
  [social-security-number]
  (Thread/sleep 1000)
  (get vampire-database social-security-number))

(defn vampire?
  [record]
  (and (:makes-blood-puns? record)
       (not (:has-pulse? record))
       record))

(defn identify-vampire
  [social-security-numbers]
  (first (filter vampire?
                 (map vampire-related-details social-security-numbers))))

; (time (vampire-related-details 2))

; (take 3 (repeatedly (fn [] (rand-int 10))))
