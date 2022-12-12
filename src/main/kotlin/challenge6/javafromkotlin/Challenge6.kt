package challenge6.javafromkotlin

fun main() {
    val employee = Employee("Jane", "Smith", 2000)

    // Make the following code successfully compile
    employee.lastName = "Jones"
    employee.salaryLast3Years = floatArrayOf(50000.25f, 54000.60f, 56800.42f)
}
