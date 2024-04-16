package org.example;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
/**
 * The Mage class represents a character of the mage class in the game
 */
public class Game {
     private List<Character> characters = new ArrayList<>();


    /**
     * Constructs a new Mage with the specified name, health, and attack power
     * @param name The name of the mage
     * @param health The initial health of the mage
     * @param attackPower The attack power of the mage
     */
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    /**
     * Starts the game and manages the turn-based battle until one character is defeated.
     */

    public void startGame() {
        int turn = 0;
        boolean gameOver = false;
        while (!gameOver) {
            Character attacker = characters.get(turn % characters.size());
            Character defender = characters.get((turn + 1) % characters.size());

            attacker.specialAttack(defender);
            System.out.println(attacker.getName() + " attacks " + defender.getName());

            if (defender.isDefeated()) {
                System.out.println(defender.getName() + " is defeated!");
                gameOver = true;
            }

            turn++;
        }
    }
    /**
     * Adds a character to the game session.
     * @param character The character to be added to the game.
     */
    public void addCharacter(Character character) {
        characters.add(character);
    }
    /**
     * Returns true if the game is over (i.e., at least one character is defeated).
     *
     * @return True if the game is over, false otherwise.
     */
    private boolean isGameOver() {
        for(Character character : characters) {
            if(character.isDefeated()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Performs a special attack on the opponent, dealing increased damage
     * @param opponent The character to be attacked
     */
    public void specialAttack(Character opponent) {
        opponent.takeDamage(50);
    }
    /**
     * Retrieves the list of characters currently participating in the game.
     * @return The list of characters in the game.
     */
    public List<Character> getCharacters() {
        return characters;
    }
}

