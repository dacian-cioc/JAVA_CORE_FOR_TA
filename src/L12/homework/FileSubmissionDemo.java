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

class InvalidFileException extends Exception {
    public InvalidFileException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private String[] files;
    private int score;

    public Student(String name, String[] files) {
        this.name = name;
        this.files = files;
        this.score = 0;
    }

    public void checkFiles() {
        for (String file : files) {
            try {
                int points = checkFileExtension(file);
                score += points;
            } catch (InvalidFileException e) {
                System.err.println(e.getMessage());
                score -= 1;  // Deduct 1 point for null or empty file
            }
        }
    }

    private int checkFileExtension(String fileName) throws InvalidFileException {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFileException("Invalid file name: " + fileName);

        }

        if (fileName.endsWith(".java")) {
            return 1; // 1 point for .java files
        } else {
            return 0; // 0 points for other files
        }
    }

    public int getScore() {
        return score;
    }
}

public class FileSubmissionDemo {
    public static void main(String[] args) {
        Student student1 = new Student("John", new String[]{"file1.java", "file2.txt", ""});
        Student student2 = new Student("Alice", new String[]{"file3.java", "file4.java", "file5.java"});
        Student student3 = new Student("Bob", new String[]{"file6.txt", "file7.java", "file8.java"});
        Student student4 = new Student("Bob", new String[]{null});
        Student student5 = new Student("Bob", new String[]{"file9.txt", "file10.java", "file11.jpg"});

        student1.checkFiles();
        student2.checkFiles();
        student3.checkFiles();
        student4.checkFiles();
        student5.checkFiles();

        System.out.println("Student 1 Score: " + student1.getScore());
        System.out.println("Student 2 Score: " + student2.getScore());
        System.out.println("Student 3 Score: " + student3.getScore());
        System.out.println("Student 4 Score: " + student4.getScore());
        System.out.println("Student 5 Score: " + student5.getScore());
    }
}