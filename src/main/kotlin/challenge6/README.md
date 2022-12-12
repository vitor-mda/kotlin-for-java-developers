# 🧠 Challenge #6

Challenge done during **Section 9: Java Interoperability**.

## 🎯 Tasks
### Calling Java from Kotlin
1. Make the following code successfully compile:
   ```kotlin
   val employee = Employee("Jane", "Smith", 2000)
   employee.lastName = "Jones"
   employee.salaryLast3Years = arrayOf(50000.25, 54000.60, 56800.42)
   ```
   `Employee` is a Java class. Its initial code is the following:
   ```java
   public class Employee {
       private String firstName;
       private String lastName;
       private int startYear;
       private float[] salaryLast3Years;

       public Employee(String firstName, String lastName, int startYear) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.startYear = startYear;
           this.salaryLast3Years = new float[3];
       }
   }
   ```
### Calling Kotlin from Java
1. Make the following Java code successfully compile by only changing the Kotlin code:
   ```java
    public class Challenge6 {
        public static void main(String[] args) {
            KotlinStuff.sayHelloToJava("vitor-mda");

            Employee employee = new Employee("John", "Smith", 2010);
            employee.startYear = 2009;

            Challenge.doMath(5, 4);

            employee.takesDefault("arg1");
        }
    }
   ```
   Kotlin code:
   ```kotlin
   fun sayHelloToJava(name: String) = println("Kotlin says hello to Java and $name")

   object Challenge {
       fun doMath(x: Int, y: Int) = (x + y) * (x - y)
   }

   class Employee(val firstName: String, val lastName: String, val startYear: Int) {
       fun takesDefault(param1: String, param2: String = "default") = println("$param1 and $param2")
   }
   ```
2. Now, do the same as before, but make the following Java code successfully compile
   without touching the Kotlin one:
   ```java
    public class Challenge6 {
        public static void main(String[] args) {
            KotlinStuff2.sayHelloToJava2("vitor-mda");

            Employee2 employee2 = new Employee2("John", "Smith", 2010);
            employee2.startYear = 2009;

            Challenge2.doMath(5, 4);
        }
    }
   ```
   Kotlin code:
   ```kotlin
   fun sayHelloToJava2(name: String) = println("Kotlin says hello to Java and $name")

   object Challenge2 {
       fun doMath(x: Int, y: Int) = (x + y) * (x - y)
   }

   class Employee2(val firstName: String, val lastName: String, var startYear: Int)
   ```
3. Make `takesDefault` throw an exception if `param1` is null.
