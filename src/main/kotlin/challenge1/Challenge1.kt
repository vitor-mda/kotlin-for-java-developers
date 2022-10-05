package challenge1

fun main() {
    // Declare two immutable String variables called `hello1` and `hello2`.
    // Assign "Hello" to both variables.
    val hello1 = "Hello"
    val hello2 = "Hello"

    // Using one line of code, test whether `hello1` and `hello2` are referentially equal.
    // Print the result.
    println(hello1 === hello2)

    // Do the same thing as above, but test for structural equality.
    println(hello1 == hello2)

    // Declare a mutable variable of type Int and assign it the value of 2988.
    var n = 2988

    // Declare an immutable variable of type Any and assign it the string:
    // "The Any type is the root of the Kotlin class hierarchy".
    // Then, using a smart cast, print out the upper-cased string.
    val x: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (x is String) println(x.uppercase())

    // Using one statement, print out the following. Make sure your code is nicely indented.
    //    1
    //   11
    //  111
    // 1111
    println("""
           1
          11
         111
        1111
    """.trimIndent())

    // Do the same as above but using `trimMargin` with "1" as margin prefix instead of `trimIndent`
    println("""
        1   1
        1  11
        1 111
        11111
    """.trimMargin(marginPrefix = "1"))
}
