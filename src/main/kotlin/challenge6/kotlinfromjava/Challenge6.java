package challenge6.kotlinfromjava;

public class Challenge6 {
    public static void main(String[] args) {
        // Make the following Java code successfully compile by only changing the Kotlin code
        KotlinStuff.sayHelloToJava("vitor-mda");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);

        employee.takesDefault("arg1");

        /*
        * Now, do the same as before, but make the following Java code successfully compile
        * without touching the Kotlin one
        */
        KotlinCode2Kt.sayHelloToJava2("vitor-mda");

        Employee2 employee2 = new Employee2("John", "Smith", 2010);
        employee2.setStartYear(2009);

        Challenge2.INSTANCE.doMath(5, 4);
    }
}
