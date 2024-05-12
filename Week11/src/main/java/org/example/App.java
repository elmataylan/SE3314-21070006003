package org.example;

/**
 * Represents the main application for interacting with characters, locations, and quests in Middle Earth
 */
public class App 
{

    /**
     * Main method to run the Middle Earth application.*
     */
    public static void main(String[] args) {
        Character frodo = new Character("Frodo", "Hobbit", 60);
        frodo.printDetails();

        Character aragorn = new Character("Aragorn", "Human", 25);
        aragorn.printDetails();

        Character legolas = new Character("Legolas", "Elf", 650);
        legolas.printDetails();

        Character gimli = new Character("Gimli", "Dwarf", 150);
        gimli.printDetails();

        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate('M', true);
        map.navigate('S', false);
        map.navigate('G', false);
        map.navigate('L', false);


        Quest quest = new Quest();
        quest.completeQuest(100, true);

        quest.completeQuest(50, false);
        quest.eradicteEvil(true, true);
        quest.protectCastle(true, 5000);
    }
}
