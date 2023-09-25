package game;

import java.util.Random;

public class Enemies {
    int health;
    int strength;
    int level;

//    public int getHealth() {
//        return health;
//    }

//    public int getStrength() {
//        return strength;
//    }

    public int getLevel() {
        return level;
    }

    Enemies() {
        this.health = 150;
        this.strength = 4;
        this.level = 1;

    }

    Enemies(int health, int strength, int level) {
        this.health = health;
        this.strength = strength;
        this.level = level;

    }

    public void attack(Heroes hero) {
        Random random = new Random();

        boolean enemyStarts = random.nextBoolean(); // Toss a coin to determine who starts

        while (this.health > 0 && Heroes.getHealth() > 0) {
            if (enemyStarts) {
                // Enemy's turn to attack
                int enemyDamage = this.calculateDamage();
                if (random.nextDouble() <= 0.1) {
                    // Critical hit for the Enemy
                    enemyDamage += 3;
                }
                Heroes.takeDamage(enemyDamage);

                if (Heroes.getHealth() <= 0) {
                    // Enemy wins
                    System.out.println("Enemy wins!");
                } else {
                    System.out.println("Enemy attacks! Hero's health: " + Heroes.getHealth());
                }
            } else {
                // Hero's turn to attack
                int heroDamage = Heroes.calculateDamage();
                if (random.nextDouble() <= 0.3) {
                    // Critical hit for the Hero
                    heroDamage += 3;
                }
                this.takeDamage(heroDamage);

                if (this.health <= 0) {
                    // Hero wins
                    Heroes.setExperience(Heroes.getExperience() + 50 * this.level);
                    if (Heroes.getExperience() >= 100 * Heroes.getLevel()) {
                        // Level up for the Hero
                        hero.levelUp();
                    }
                    System.out.println("Hero wins!");
                } else {
                    System.out.println("Hero attacks! Enemy's health: " + this.health);
                }
            }

            // End the battle after this round
            break;
        }

//        boolean isCriticalHit = Math.random() <= 0.3;
//        int damage = strength + (isCriticalHit ? 3 : 0);
//
//        Heroes.health -= damage;
//
//        if (Heroes.health <= 0) {
//            Heroes.health = 0;
//            System.out.println("Enemy defeated the Hero!");
//        } else {
//            System.out.println("Enemy attacked the Hero for " + damage + " damage.");
//            System.out.println("Hero's health: " + Heroes.health);
//        }

//        while (this.health > 0 && Heroes.getHealth() > 0) {
//            if (enemyStarts) {
//                // Enemy's turn to attack
//                int enemyDamage = this.calculateDamage();
//                if (random.nextDouble() <= 0.1) {
//                    // Critical hit for the Enemy
//                    enemyDamage += 3;
//                }
//                hero.takeDamage(enemyDamage);
//
//                if (Heroes.getHealth() <= 0) {
//                    // Enemy wins
//                    System.out.println("Enemy wins!");
//                } else {
//                    System.out.println("Enemy attacks! Hero's health: " + Heroes.getHealth());
//                }
//            } else {
//                // Hero's turn to attack
//                int heroDamage = hero.calculateDamage();
//                if (random.nextDouble() <= 0.3) {
//                    // Critical hit for the Hero
//                    heroDamage += 3;
//                }
//                this.takeDamage(heroDamage);
//
//                if (this.health <= 0) {
//                    // Hero wins
//                    hero.setExperience(Heroes.getExperience() + 50 * this.level);
//                    if (Heroes.getExperience() >= 100 * Heroes.getLevel()) {
//                        // Level up for the Hero
//                        hero.levelUp();
//                    }
//                    System.out.println("Hero wins!");
//                } else {
//                    System.out.println("Hero attacks! Enemy's health: " + this.health);
//                }
//            }
//            enemyStarts = !enemyStarts; // Switch turns
//        }
    }

    void takeDamage(int heroDamage) {
        this.health -= heroDamage;
        if (this.health < 0) {
            this.health = 0; // Ensure health does not go below 0
        }
    }

    int calculateDamage() {
        Random random = new Random();
        int damage = this.strength;

        if (random.nextDouble() <= 0.1) {
            // Critical hit for the Enemy
            damage += 3;
        }

        return damage;
    }

    public int getHealth() {
        return health;
    }
}
