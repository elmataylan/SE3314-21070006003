package org.example;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit test for the Game class.
 */
public class GameTest extends TestCase {

    /**
     * Test adding characters to the game.
     */
    @Test
    public void testAddCharacter() {
        Game game = new Game();
        Warrior warrior = new Warrior("Conan", 100, 15);
        Mage mage = new Mage("Merlin", 80, 20);
        Archer archer = new Archer("Legolas", 90, 18);

        game.addCharacter(warrior);
        game.addCharacter(mage);
        game.addCharacter(archer);

        assertEquals(3, game.getCharacters().size());
    }

    /**
     * Test starting the game and ensuring proper execution of turns.
     */
    @Test
    public void testStartGame() {
        Game game = new Game();
        Warrior warrior = new Warrior("Conan", 100, 15);
        Mage mage = new Mage("Merlin", 80, 20);
        Archer archer = new Archer("Legolas", 90, 18);

        game.addCharacter(warrior);
        game.addCharacter(mage);
        game.addCharacter(archer);

        game.startGame();

        assertTrue(game.isGameOver());
    }

    /**
     * Test special attacks during the game.
     */
    @Test
    public void testSpecialAttacks() {
        Warrior warrior = new Warrior("Conan", 100, 15);
        Mage mage = new Mage("Merlin", 80, 20);
        Archer archer = new Archer("Legolas", 90, 18);

        warrior.specialAttack(mage);
        mage.specialAttack(archer);
        archer.specialAttack(warrior);

        assertEquals(65, mage.getHealth());
        assertEquals(65, archer.getHealth());
        assertEquals(70, warrior.getHealth());
    }
}
