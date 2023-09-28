//Implement the Lector class, which extends the Person class and has the
//following fields and methods:
//Fields:
//• dailySalary
//Constructors:
//• Lector(String firstName, String lastName, int age, String gender,
//double dailySalary)
//Methods:
//• showLectorInfo() – the purpose of the method is to display the
//information about the person and the daily salary by outputting
//the values of each of its fields into the console.
//• calculateOvertime(double hours) - the purpose of the method is
//to calculate and return the amount of all extra working hours. In
//case that the lecturer had to replace a colleague, i.e. work
//outside his working hours, he is owed an additional amount of
//money (overtime) for the hours he worked. As an additional
//condition, we can add that only experienced lecturers receive
//money from overtime - let's assume that if the lecturer is over
//30 years old, then he is more experienced and only than will be
//paid for overtime.
//The amount is calculated as follows: For each extra hour, the
//experienced lecturer is paid the amount he receives per hour
//(depends on the daily salary), multiplied by 2.

package L08.homework;

public class Lector extends Person {
    // Constant for working hours per day
    private static final int WORKING_DAY_IN_HOURS = 8;

    // Constant for the minimum age of an experienced lecturer
    private static final int EXPERIENCED_LECTOR_MIN_AGE = 30;
    private double dailySalary;

    // Constructor for initializing lector fields
    public Lector(String firstName, String lastName, int age, String gender, double dailySalary) {
        super(firstName, lastName, age, gender);
        this.dailySalary = dailySalary;
    }

    // Method to display lector information, including daily salary
    public void showLectorInfo() {
        super.showPersonInfo(); // Reuse the parent class method
        System.out.println(getFirstName() + " " + getLastName() + " " +  "- Daily Salary: $" + dailySalary);


    }

    // Method to calculate overtime payment for experienced lecturers
    public double calculateOvertime(double hours) {
        if (getAge() > EXPERIENCED_LECTOR_MIN_AGE) {
            // Experienced lecturers receive overtime payment
            return (dailySalary / WORKING_DAY_IN_HOURS) * hours * 2; // Assuming 8 hours per working day
        }
        return 0.0; // Not eligible for overtime
    }


}

