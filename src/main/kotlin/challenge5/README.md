# 🧠 Challenge #5

Challenge done during **Section 7: Lambda Expressions, Collections and Generics**.

## 🎯 Tasks
1. Make the following code compile:
   ```kotlin
   fun main() {
    val joe = Person("Joe", "Jones", 45)
    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")
   }

   class Person(val firstName: String, val lastName: String, val age: Int)
   ```
2. Using the following data, create an `ImmutableMap`. Each `Person` entry should
   have its last name as key.
   ```kotlin
   val joe = Person("Joe", "Jones", 45)
   val jane = Person("Jane", "Smith", 12)
   val mary = Person("Mary", "Wilson", 70)
   val john = Person("John", "Adams", 32)
   val jean = Person("Jean", "Smithson", 66)
   ```
3. Without using an explicit loop, print out how many people have
   last names beginning with the letter "S".
4. Without using an explicit loop and using the created `Map`, create and print
   a list of `Pair`s. The first item in the pair should be the first name and
   the last item in the pair should be the last name.
5. Using the `also` function and the people `Map`, print out each `Person`'s
   name and age, like in the following examples:
   ```
   Joe is 45 years old.
   Jane is 12 years old.
   ```
6. Without using an explicit loop, create a `list3` which contains only elements
   present in both `list1` and `list2`.
   ```kotlin
   val list1 = listOf(1, 4, 9, 15, 33)
   val list2 = listOf(4, 55, -83, 15, 22, 101)
   ```
7. Do whatever you need to do to make `paper = regularPaper` compile.
   ```kotlin
   val regularPaper = Box<Regular>()
   val paper = Box<Paper>()
   paper = regularPaper

   class Box<T>
   open class Paper
   class Regular : Paper()
   class Premium : Paper()
   ```
8. 
