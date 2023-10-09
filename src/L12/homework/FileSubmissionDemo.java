//Write a function called checkFileExtension(). The checkFileExtension() method
//takes in one parameter: fileName (String).
//The method should return an integer representing the number of points a
//student receives for properly submitting a file in Java. If a student’s submitted file
//ends in .java, they get 1 point. If a student’s submitted file doesn’t end in .java,
//they get 0 points. If the file submitted is null or an empty string, an exception
//should be thrown and you should give the student -1 points. What kind of
//exception - your own custom exception!
//Each student has: name, array with 5 files and score.
//In the main(), create at least 3 students in order to test out your work. If an
//exception is caught, make sure to print out appropriate error message.

package L12.homework;

public class FileSubmissionDemo {
    public static void main(String[] args) {

        Student student1 = new Student("John");
        Student student2 = new Student("Alice");
        Student student3 = new Student("Bob");
        Student student4 = new Student("Robert");
        Student student5 = new Student("Roxanne");

        student1.addFile("file1.java");
        student1.addFile("file2.txt");
        student1.addFile("file2.txt");
        student1.addFile("file2.txt");
        student1.addFile("");

        student2.addFile("file3.java");
        student2.addFile("file4.java");
        student2.addFile("");
        student2.addFile("file5.java");
        student2.addFile("file5.java");

        student3.addFile("project.java");
        student3.addFile("project.java");
        student3.addFile("project.txt");
        student3.addFile("project.java");
        student3.addFile("project.java");

        student4.addFile(null);
        student4.addFile(null);
        student4.addFile(null);
        student4.addFile(null);
        student4.addFile(null);

        student5.addFile("file9.txt");
        student5.addFile("file9.txt");
        student5.addFile("file9.java");
        student5.addFile("file9.txt");
        student5.addFile("file9.txt");
        student5.addFile("file9.txt");

        student1.checkFiles();
        student2.checkFiles();
        student3.checkFiles();
        student4.checkFiles();
        student5.checkFiles();

        System.out.println(student1.getName() + " Student 1 Score: " + student1.getScore());
        System.out.println(student2.getName() + " Student 2 Score: " + student2.getScore());
        System.out.println(student3.getName() + " Student 3 Score: " + student3.getScore());
        System.out.println(student4.getName() + " Student 4 Score: " + student4.getScore());
        System.out.println(student5.getName() + " Student 5 Score: " + student5.getScore());
    }
}