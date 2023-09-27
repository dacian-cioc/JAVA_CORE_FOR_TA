//Implement the Person class, which has the following fields and methods:
//Fields:
//• firstName
//• lastName
//• age
//• gender
//Constructors:
//• Only one with params for all fields
//Methods:
//• showPersonInfo() – the purpose of the method is to display the
//information about the person by outputting the values of each
//of its fields into the console.

package L08.homework;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    // Constructor for initializing all fields
    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // Method to display person information
    public void showPersonInfo() {
        System.out.println("Person Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("----------------------------");
    }
    public int getAge() {
        return age; // Return the age field
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

