// Trying out else if...nothing odd here
def myFavoriteGenres = [ "Alternative Rock", "Indie Rock", "Electro-swing" ]

println "Here is the myFavoriteGenres"
println myFavoriteGenres
println "Check if either Hip Hop or Alternative Disco with Shoegaze Influence are in there."

if(myFavoriteGenres.contains("Hip Hop")) {
  println "I love Hip Hop!"
} else if(myFavoriteGenres.contains("Alternative Disco with Shoegaze Influence")) {
  println "That is like, literally, my favorite genre."
} else {
  println "Neither Hip Hop nor Alternative Disco with Shoegaze Influence are favorites."
  println "I just don't think we can get along."
}
