//Implement the Demo class which contains a main method and do the following:
//Initialize an array with 10 elements of type Person.
//Create 3 objects of each type (Person, Student, Lector) and insert them into the
//array of people.
//Iterate through the array and depending on the type of object, call the correct
//method for it (showPersonInfo(), showStudentInfo() or showLectorInfo())
//Iterate through the array one more time, this time displaying for all lectors (you
//should have only 3) the amount owed to them for 4 hours of overtime work.

package L08.homework;

public class Demo {
    public static void main(String[] args) {
        Person[] people = new Person[9];


        // Create and insert objects of different types into the array
        people[0] = new Person("Person John", "Doe", 35, "Male");
        people[1] = new Student("Student Alice", "Smith", 20, "Female", 95.5);
        people[2] = new Lector("Lector David", "Johnson", 25, "Male", 200.0);
        people[3] = new Person("Person Emily", "Williams", 28, "Female");
        people[4] = new Student("Student James", "Brown", 22, "Male", 88.0);
        people[5] = new Lector("Lector Mary", "Davis", 45, "Female", 250.0);
        people[6] = new Person("Person Michael", "Wilson", 32, "Male");
        people[7] = new Student("Student Sophia", "Lee", 19, "Female", 92.0);
        people[8] = new Lector("Lector Oliver", "Moore", 50, "Male", 220.0);

        // Iterate through the array and call the correct method based on object type
        for (Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Lector) {
                ((Lector) person).showLectorInfo();
                // Calculate and display overtime for lectors
                    double overtimeAmount = ((Lector) person).calculateOvertime(4.0);
                    System.out.println("Overtime for " + person.getFirstName() + " " + person.getLastName() + "(4 hours): $" + overtimeAmount);
                    System.out.println("------------------------------");
            } else {
                person.showPersonInfo();
            }
        }
    }
}
