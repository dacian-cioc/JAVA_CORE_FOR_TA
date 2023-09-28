//Implement the Student class, which extends the Person class and has the
//following fields and methods:
//Fields:
//• grade
//Constructors:
//• Student(String firstName, String lastName, int age, String
//gender, double grade)
//Methods:
//• showStudentInfo() – the purpose of the method is to display the
//information about the person and the grade by outputting the
//values of each of its fields into the console.

package L08.homework;

public class Student extends Person {
    private double grade;

    // Constructor for initializing student fields
    public Student(String firstName, String lastName, int age, String gender, double grade) {
        super(firstName, lastName, age, gender);
        this.grade = grade;
    }

    // Method to display student information, including grade
    public void showStudentInfo() {
        super.showPersonInfo(); // Reuse the parent class method
        System.out.println(getFirstName() + " " + getLastName()  + " " + "- Grade: " + grade);
        System.out.println("---------------------------");
    }
}
