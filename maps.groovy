// Fun with maps
def ages = [
  "reality": 23,
  "goedel": 45,
  "escher": 99,
  "bach": 33
]

println "First we print out the entire map"

println ages

println "Next, we print out the value of the reality key in the ages map"

println ages["reality"]

println "Let's change the value of the escher key to 21, and print that"

ages["escher"] = 21
println ages["escher"]

println "Remove the bach key from the ages map"

ages.remove("bach")

println "Finally, call size on the ages map having deleted one element"

println ages.size()

println "For yucks, print out the map at the very end."

println ages

println "Assuming that you can run add to add a key and value"

ages.put("today", 14)

println ages
