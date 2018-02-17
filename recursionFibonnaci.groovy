// Example of recursion with Fibonnaci sequence
def fibonnaci(n) {
  if(n <= 2) {
    return 1
  } else {
    return fibonnaci(n - 1) + fibonnaci(n-2)
  }
}

println fibonnaci(4)
println fibonnaci(5)
