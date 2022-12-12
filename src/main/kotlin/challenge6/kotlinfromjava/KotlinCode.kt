@file:JvmName("KotlinStuff")

package challenge6.kotlinfromjava

fun sayHelloToJava(name: String) = println("Kotlin says hello to Java and $name")

object Challenge {
    @JvmStatic fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class Employee(val firstName: String, val lastName: String, @JvmField var startYear: Int) {

    // Make `takesDefault` throw an exception if `param1` is null
    @JvmOverloads fun takesDefault(param1: String, param2: String = "default") = println("$param1 and $param2")
}
