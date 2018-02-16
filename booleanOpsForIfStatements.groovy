def myString = "I like turtles"
def containsBiscuits = myString.contains("biscuits")

if(containsBiscuits && myString.contains("turtles")) {
  println "My string contains turtles!"
}

if(containsBiscuits || myString.contains("turtles")) {
  println "My string contains biscuits."
}
