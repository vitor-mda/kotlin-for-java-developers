package challenge5

fun main() {
    // Using the following data, create an `ImmutableMap`. Each `Person` entry should have its last name as key.
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val peopleByLastName = mapOf(
        joe.lastName to joe,
        jane.lastName to jane,
        mary.lastName to mary,
        john.lastName to john,
        jean.lastName to jean
    )

    // Without using an explicit loop, print out how many people have last names beginning with the letter "S".
    println(peopleByLastName.keys.count { it.startsWith('S') })

    /*
     * Without using an explicit loop and using the created `Map`, create and print
     * a list of `Pair`s. The first item in the pair should be the first name and
     * the last item in the pair should be the last name.
     */
    println(peopleByLastName.values.map { Pair(it.firstName, it.lastName) })

    // Using the `also` function and the people `Map`, print out each `Person`'s name and age
    peopleByLastName.values.forEach {
        it.also {
            println("${ it.firstName } is ${ it.age } years old.")
        }
    }

    /*
     * Without using an explicit loop, create a `list3` which contains only elements
     * present in both `list1` and `list2`.
     */
    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    val list3 = list1.intersect(list2).toList()
    println(list3)

    // Make the following code compile.
    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    // Do whatever you need to do to make `paper = regularPaper` compile.
    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper
}

data class Person(val firstName: String, val lastName: String, val age: Int)

class Box<out T>
open class Paper
class Regular : Paper()
class Premium : Paper()
