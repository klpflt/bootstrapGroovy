// Checking out else for conditions that aren't met in if statement
def myFavoriteGenres = [ "Hip Hop", "Bluegrass", "Alternative Math Rock" ]

println myFavoriteGenres

println "Check to see if Big Room Houes is a favorite genre."

if(myFavoriteGenres.contains("Big Room House")) {
  println "There is something very wrong!"
} else {
  println "Well at least your not into, like, Big Room House, or something."
}
