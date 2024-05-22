package org.example;

public class Character {
    public String name;
    public int age;

    /**
     * Constructor of Character.
     * @param name Character's name.
     * @param age Character's age.
     */

    public Character(String name, int age) {
        this.name = name; // Fixed: Assign parameter to instance variable
        this.age = age; // Fixed: Assign parameter to instance variable
    }
}
