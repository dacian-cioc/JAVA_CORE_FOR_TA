package L12.homework;

public class Student {
    private String name;
    private String[] files;
    private int score;

    public Student(String name) {
        this.name = name;
        this.files = new String[5];
        this.score = 0;
    }

    // Method to add a file to the files array
    public void addFile(String file) {
        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = file;
                return; // File added, exit the method
            }
        }
        System.err.println("Files space is full. Cannot add more files.");
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

    public String getName() {
        return name;
    }
}

