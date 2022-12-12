package challenge6.kotlinfromjava

fun sayHelloToJava2(name: String) = println("Kotlin says hello to Java and $name")

object Challenge2 {
    fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class Employee2(val firstName: String, val lastName: String, var startYear: Int)
