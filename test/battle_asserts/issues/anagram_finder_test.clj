(ns battle-asserts.issues.anagram-finder-test
  (:require [clojure.test :refer :all]
            [test-helper :as h]
            [battle-asserts.issues.anagram-finder :as issue]))

(h/generate-tests issue/test-data issue/solution)
