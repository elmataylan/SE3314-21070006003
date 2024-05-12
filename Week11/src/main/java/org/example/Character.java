package org.example;

/**
 * Represents a character in the lord of the rings world
 */
public class Character {
    private final String name;
    private final String race;
    private final int age;

    /**
     * Constructs a character with the specified name, race, and age
     *
     * @param name The name of character
     * @param race The race of character
     * @param age  The age of character
     */
    public Character(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    /**
     * Prints details about the character, including race-specific information and age.
     */
    public void printDetails() {
        if (race.equals("Hobbit"))
            System.out.println("Character is a Hobbit");
        else if (race.equals("Human"))
            System.out.println("Character is a Human");
        else if (race.equals("Elf"))
            System.out.println("Character is an Elf");
        else if (race.equals("Dwarf"))
            System.out.println("Character is a Dwarf");

        if (age >= 50) {
            System.out.println("Character is 50 or older");
        } else if (name.equals("Frodo"))
            System.out.println("Character is Frodo");
        else if (name.equals("Aragorn"))
            System.out.println("Character is Aragorn");
        else if (name.equals("Legolas"))
            System.out.println("Character is Legolas");
        else if (name.equals("Gimli"))
            System.out.println("Character is Gimli");
    }
}