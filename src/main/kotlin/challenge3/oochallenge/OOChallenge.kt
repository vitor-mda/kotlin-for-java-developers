package challenge3.oochallenge

fun main() {
    arrayOf(
        KotlinBicycle(cadence = 10, speed = 10, gear = 10),
        KotlinMountainBike(cadence = 20, speed = 20, gear = 20, seatHeight = 20),
        KotlinRoadBike(cadence = 30, speed = 30, gear = 30, tireWidth = 30)
    ).forEach { it.printDescription() }

    arrayOf(
        KotlinBicycle(cadence = 10, speed = 10),
        KotlinMountainBike(cadence = 20, speed = 20, seatHeight = 20),
        KotlinRoadBike(cadence = 30, speed = 30, tireWidth = 30)
    ).forEach { it.printDescription() }

    KotlinMountainBike(color = "green", cadence = 15, speed = 15, seatHeight = 15)
        .printDescription()

    KotlinMountainBike.availableColors.forEach { println(it) }
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }
}

class KotlinMountainBike(cadence: Int, speed: Int, gear: Int = 10, var seatHeight: Int)
    : KotlinBicycle(cadence, speed, gear) {

    constructor(color: String, cadence: Int, speed: Int, seatHeight: Int)
            : this(cadence = cadence, speed = speed, seatHeight = seatHeight) {
        println("Color: $color")
}
    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(cadence: Int, speed: Int, gear: Int = 10, val tireWidth: Int)
    : KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}
