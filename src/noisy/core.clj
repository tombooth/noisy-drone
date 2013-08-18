(ns noisy.core
  [:use overtone.live clj-drone.core])

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(drone-initialize)
(drone :take-off)
(Thread/sleep 10000)
(drone :land)