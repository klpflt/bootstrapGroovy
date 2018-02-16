// Let's embed maps with other lists
def somebodiesFavoriteBands = [
  "reality": [ "Modest Mouse", "David Bowie", "Cyne" ],
  "socrates": [ "John Lennon",  "David Bowie", "The Rolling Stones" ]
]

println "We create a map with lists as key values, then print it"
println somebodiesFavoriteBands

println "We add another key to the map called 'zizek'"
somebodiesFavoriteBands['zizek'] = [ "Daft Punk", "Emancipator", "Roysopp" ]
println somebodiesFavoriteBands

println "Print the 2 value of the map for key 'zizek'"
println somebodiesFavoriteBands['zizek'][2]
