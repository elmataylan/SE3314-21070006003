package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        final Character frodo = new Character("Frodo Baggins", 50); // FinalLocalVariable, age cannot be minus.
        final Character aragorn = new Character("Aragorn", 87); // FinalLocalVariable
        final MiddleEarthMap map = new MiddleEarthMap(); // FinalLocalVariable
        map.navigate("Mordor", true);
        final Quest quest = new Quest("", frodo, map); // FinalLocalVariable

        quest.addParticipant(aragorn);
        quest.start();
    }
}
