package org.example;

/**
 * The Mage class represents a character of the mage class in the game.
 */
public class Mage extends Character {

    /**
     * Constructs a new Mage with the specified name, health, and attack power.
     *
     * @param name        The name of the mage.
     * @param health      The initial health of the mage.
     * @param attackPower The attack power of the mage.
     */
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }



    /**
     * Performs a special attack on the opponent, dealing increased damage.
     * The mage's special attack inflicts additional damage to the opponent.
     *
     * @param opponent The character to be attacked.
     */

    public void specialAttack(Character opponent) {
        opponent.takeDamage(attackPower + 50);
    }
}