package org.example;
/**
 * The abstract class Character represents a generic character in a game
 * It serves as a base for different types of characters, providing common attributes and methods
 */
public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    /**
     * Constructs a character with the specified name, health, and attack power
     * @param name        the name of the character
     * @param health      the initial health points of the character
     * @param attackPower the attack power of the character
     */
    public Character(String name,int health,int attackPower) {
        this.name = name; this.health = health; this.attackPower = attackPower;
    }
    /**
     * Retrieves the name of the character.
     * @return the name of the character, or "Unknown" if the name is not set
     */
    public String getName() {
        if(name != null) return name;
        else return "Unknown";
    }
    /**
     * Retrieves the current health points of the character
     * @return the current health points of the character
     */
    public int getHealth() {
        return health;
    }

    /**
     * Reduces the health points of the character by the specified amount of damage
     * @param damage the amount of damage to be taken
     */
    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void specialAttack(Character opponent);

    public boolean isDefeated() {
        if(health <= 0) return true;
        return false;
    }

    public void complexMethodExample() {

    }
}
