package org.example;
/**
 * The Warrior class represents a character of the warrior class in the game.
 */
public class Warrior extends Character {
    /**
     * Constructs a new Warrior the specified name, health, and attack power
     * @param name The name of the warrior
     * @param health The initial health of the warrior
     * @param attackPower The attack power of the warrior
     */
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    /**
     * Performs special attack on the opponent, dealing double normal attack power
     * @param opponent character to be attacked
     */
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower * 2);
    }
}