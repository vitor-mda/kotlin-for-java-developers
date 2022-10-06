package challenge2

fun main() {
    // 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384
    val floatVar1 = -3847.384f
    val floatVar2: Float = -3847.384f

    // 2. Now change both of those variable declarations into nullable variables.
    val nullableFloatVar1 = (-3847.384f)?.toFloat()
    val nullableFloatVar2: Float? = -3847.384f

    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4 and 5.
    val shorts = arrayOf<Short>(1, 2, 3, 4, 5)

    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.
    val nullableInts = Array<Int?>(size = 40) { i -> (1 + i) * 5 }

    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method1 (char[] charArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b' and 'c'.
    val passableArray = charArrayOf('a', 'b', 'c')

    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.lowercase() when x isn't null,
    // and the string "I give up!" when x is null.
    val anotherString = x?.lowercase() ?: "I give up!"

    // 7. Now use the let function to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result
    x?.let { it.lowercase().replace(oldValue = "am", newValue = "am not") }

    // 8. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // Change the following code to assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = null
    // myNonNullVariable?.toDouble()
    myNonNullVariable!!.toDouble()
}
