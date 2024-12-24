```groovy
def myMethod(arg) {
  if (arg == null) {
    return "Null argument"
  } else if (arg instanceof String) {
    return arg.toUpperCase()
  } else {
    return arg.toString() // potential NumberFormatException
  }
}

println myMethod(null) // Output: Null argument
println myMethod("hello") // Output: HELLO
println myMethod(123) // Output: 123
println myMethod([1,2,3]) //Output: [1, 2, 3]
println myMethod(new Date()) //Output: Tue Sep 26 16:16:26 EDT 2023
println myMethod(new Object()) //Output: java.lang.Object@<hashcode>
```