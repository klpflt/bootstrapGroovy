def favoriteBands = [
  "reality": [ "Modest Mouse", "David Bowie", "Cyne" ],
  "socrates": [ "John Lennon", "David Bowie", "The Rolling Stones"],
  "zizek": [ "Daft Punk", "Emanicipator", "Royksopp" ]
]

favoriteBands.each { person, bands ->
  println "The favorite bands of " + person + " are "  + bands.join(', ')
}
