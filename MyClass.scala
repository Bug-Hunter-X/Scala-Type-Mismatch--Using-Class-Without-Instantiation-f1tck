```scala
class MyClass(val value: Int) {
  def this() = this(0) // Auxiliary constructor
  def myMethod(): Unit = {
    println(value)
  }
}

object Main extends App {
  val obj1 = new MyClass(5)
  obj1.myMethod() // Output: 5
  val obj2 = new MyClass()
  obj2.myMethod() // Output: 0
  val obj3 = MyClass // Error occurs here: Type mismatch
}
```