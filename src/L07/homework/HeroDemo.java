package game;

import java.util.Random;

public class HeroDemo {
    private String name;

    public static void main(String[] args) {
        // Generate a random strength value between 5 and 10
        Random random = new Random();
        int randomStrength = random.nextInt(6) + 5; // Generates a random number between 5 and 10

        // Create a Hero object with optional name
        Heroes Fantastic4 = new Heroes("Fantastic4", 100, 0, randomStrength, 1);


        int interactions = 0;


        // Display hero information
//        System.out.println("Hero 1 Information:");
//        System.out.println("Name: " + Heroes.getname());
//        System.out.println("Health: " + Heroes.getHealth());
//        System.out.println("Experience: " + Heroes.getExperience());
//        System.out.println("Strength: " + Heroes.getStrength());
//        System.out.println("Level: " + Heroes.getLevel());

        // Task 4: Battle with 10 iterations
        while (interactions < 10){
            int heroLevel = new Random().nextInt(4) + 4;
//            System.out.println("-------------------------------");
//            System.out.println("Hero Level: " + heroLevel);
            int enemyHealth = random.nextInt((101) + 100) * heroLevel; // Random enemy health between 100 and 200
//            System.out.println("Enemy Health: " + enemyHealth);

            int enemyStrength = random.nextInt(3) + 8 + (int) (Heroes.getStrength() * 0.10); // Random enemy strength
//            System.out.println("Strength Enemy: " + enemyStrength);

            int enemyLevel = random.nextInt(Heroes.getLevel()) + 1; // Random enemy level
//            System.out.println("Enemy Level: " + enemyLevel);


            Enemies enemy = new Enemies(enemyHealth, enemyStrength, enemyLevel);

            boolean heroStarts = Math.random() <= 0.5;

            if (heroStarts) {
                if (enemy.getLevel() > Heroes.getLevel()) {
                    Heroes.attack(enemy);
                } else {
                    enemy.attack(Fantastic4);
                }
                interactions++;
            }

        }
    }
}
