// That classic Person class from Java
class Person {
  def name

  def sayName() {
    println "Hello, my name is " + name + "."
  }

  def say(thing) {
    println name + " says '" + thing + "'"
  }
}

def plato = new Person()

plato.name = "Plato"

plato.sayName()
plato.say("The law of nature is the law of the stronger!")

println "And now, for setting name as a parameter"

def aristotle = new Person('name': 'Aristotle')
aristotle.sayName()
