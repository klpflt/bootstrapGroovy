// Iterating through a file, and printing each line with some text
def myTurtles = []

new File("turtles.txt").eachLine { turtle ->
  myTurtles << turtle
}

myTurtles.each { turtle ->
  println "One kind of turtle is " + turtle
}
