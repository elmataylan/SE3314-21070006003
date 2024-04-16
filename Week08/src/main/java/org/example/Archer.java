package org.example;

/**
 * The Archer class represents a character of the archer class in the game
 */
public class Archer extends Character {

    /**
     * Constructs a new Archer with the specified name, health, and attack power
     * @param name The name of the archer
     * @param health The initial health of the archer
     * @param attackPower The attack power of the archer
     */
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    /**
     * Performs a special attack on the opponent, dealing increased damage
     * The archer's special attack has additional attack power
     * @param opponent The character to be attacked
     */
    @Override
    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 20);
    }
}