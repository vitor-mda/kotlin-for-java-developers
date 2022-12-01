package challenge4

fun main() {
    // Use a range to print out the numbers from 5 to 5000 in steps of 5.
    (5..5000).step(5).forEach { println(it) }

    // Use a range to print out the numbers from -500 to 0.
    (-500..0).forEach { println(it) }

    // Using a range, print the first 15 numbers in the Fibonacci sequence.
    var previousNumber = 0
    println(previousNumber)

    (1..14).fold(1) { acc, _ ->
        println(acc)
        val sum = acc + previousNumber
        previousNumber = acc
        sum
    }

    /* Without overwriting the starting code, add changes to it which will make it print the following:
    * 1
    * 11
    * 100
    * 99
    * 98
    * 2 */
    for (i in 1..5) {
        println(i)
        if (i == 2) break

        for (j in 11..20) {
            if (j == 12) break
            println(j)

            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) break
            }
        }
    }

    /* Declare a variable called `num` (`Int`) and assign it any value you choose. Also declare a variable called `dnum` (`Double`) and do the following:
    * - in one expression:
    *   - if `num` > 100, assign `dnum` -234.567
    *   - if `num` < 100, assign `dnum` 4444.555
    *   - if `num` == 100, assign `dnum` 0.0
    * - print the value of `dnum`. */
    val num = (0..200).random()
    val dnum = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }
    println(dnum)
}
