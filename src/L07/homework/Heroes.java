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

    public static void attack(@NotNull Enemies enemy) {
        boolean isCriticalHit = Math.random() <= 0.1;
        int damage = strength + (isCriticalHit ? 3 : 0);
        enemy.health -= damage;

        if (enemy.health <= 0) {
            enemy.health = 0;
            System.out.println("Hero defeated the enemy! ");

            if (Math.random() <= 0.3) {
                setHealth(100);
                System.out.println("Hero's health restored to 100.");
            }
            int experienceGained = 50 * enemy.level;
            experience += experienceGained;
            System.out.println("Hero gained " + experienceGained + " experience points.");
        } else {
            System.out.println("Hero attacked the enemy for " + damage + " damage.");
            System.out.println("Enemy's health: " + enemy.health);
        }
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

    public void takeDamage(int enemyDamage) {
        health -= enemyDamage;
        if (health < 0) {
            health = 0; // Ensure health does not go below 0
        }
    }

    public int calculateDamage() {
        Random random = new Random();
        int damage = strength;

        if (random.nextDouble() <= 0.3) {
            // Critical hit for the Hero
            damage += 3;
        }

        return damage;
    }

    public void setExperience(int experience) {
        Heroes.experience = experience;
    }

    public static String getname() {
        return getName();
    }
}
