package game;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Heroes {
    static String name;
    static int health;
    static int strength;
    static int experience;
    static int level;

    Heroes() {
        name = "Default Hero";
        health = 100;
        strength = 7;
        experience = 0;
        level = 1;

    }

    Heroes(String name, int health, int strength, int experience, int level) {
        Heroes.name = name;
        Heroes.health = health;
        Heroes.strength = strength;
        Heroes.experience = experience;
        Heroes.level = level;

    }

    public static int getHealth() {
        return health;
    }

    public static String getName() {
        return name;
    }

    public static int getStrength() {
        return strength;
    }

    public static int getExperience() {
        return experience;
    }

    public static int getLevel() {
        return level;
    }

    public static void attack(Enemies enemy) {
        Random random = new Random();
        boolean heroStarts = random.nextBoolean(); // Toss a coin to determine who starts

        while (health > 0 && enemy.getHealth() > 0) {
            if (heroStarts) {
                // Hero's turn to attack
                int heroDamage = calculateDamage();
                if (random.nextDouble() <= 0.3) {
                    // Critical hit for the Hero
                    heroDamage += 3;
                }
                enemy.takeDamage(heroDamage);

                if (enemy.getHealth() <= 0) {
                    // Hero wins
                    health = Math.min(health + 100, 100 * level);
                    if (random.nextDouble() <= 0.3) {
                        // Hero receives a burst of energy
                        health += 20;
                    }
                    experience += 50 * enemy.getLevel();
                    if (experience >= 100 * level) {
                        // Level up
                        level++;
                        health = health * level;
                        int strengthIncrease = random.nextInt(4) + 3;
                        strength = strength * level + strengthIncrease;
                        experience = 0;
                    }
                    System.out.println("Hero wins!");
                } else {
                    System.out.println("Hero attacks! Enemy's health: " + enemy.getHealth());
                }
            } else {
                // Enemy's turn to attack
                int enemyDamage = enemy.calculateDamage();
                if (random.nextDouble() <= 0.1) {
                    // Critical hit for the Enemy
                    enemyDamage += 3;
                }
                takeDamage(enemyDamage);

                if (health <= 0) {
                    // Enemy wins
                    System.out.println("Enemy wins!");
                } else {
                    System.out.println("Enemy attacks! Hero's health: " + health);
                }
            }

            // End the battle after this round
            break;
        }
//        boolean isCriticalHit = Math.random() <= 0.1;
//        int damage = strength + (isCriticalHit ? 3 : 0);
//        enemy.health -= damage;
//
//        if (enemy.health <= 0) {
//            enemy.health = 0;
//            System.out.println("Hero defeated the enemy! ");
//
//            if (Math.random() <= 0.3) {
//                setHealth(100);
//                System.out.println("Hero's health restored to 100.");
//            }
//            int experienceGained = 50 * enemy.level;
//            experience += experienceGained;
//            System.out.println("Hero gained " + experienceGained + " experience points.");
//        } else {
//            System.out.println("Hero attacked the enemy for " + damage + " damage.");
//            System.out.println("Enemy's health: " + enemy.health);
//        }
    }

    public void avoid(Enemies enemy) {
        System.out.println(name + " avoids the enemy");
        experience -= 10;
        health = Math.min(health + 50, 100 * level);
    }

    public static void setHealth(int health) {
        int maxHealth = 100 * level;
        Heroes.health = Math.min(health, maxHealth);
    }

    public void levelUp() {
        int maxHealth = 100 * level;
        int maxStrength = strength * level;
        experience = 0;
        level++;
        health = Math.min(health + 50, maxHealth);
        strength = Math.min(strength + (new Random().nextInt(6 - 3) + 3), maxStrength);
    }

    public static void takeDamage(int enemyDamage) {
        health -= enemyDamage;
        if (health < 0) {
            health = 0; // Ensure health does not go below 0
        }
    }

    public static int calculateDamage() {
        Random random = new Random();
        int damage = strength;

        if (random.nextDouble() <= 0.3) {
            // Critical hit for the Hero
            damage += 3;
        }

        return damage;
    }

    public static void setExperience(int experience) {
        Heroes.experience = experience;
    }

    public static String getname() {
        return getName();
    }
}
