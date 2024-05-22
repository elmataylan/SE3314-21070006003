package org.example;

import java.util.ArrayList;

public class Quest {
    public String questName;
    public Character leader;
    public ArrayList<Character> participants;
    public MiddleEarthMap map;

    /**
     * Constructor of Quest.
     * @param questName Quest name.
     * @param leader Leader's name and age.
     * @param map Shows the quest's location.
     */

    public Quest(String questName, Character leader, MiddleEarthMap map) {
        this.questName = questName; // Fixed: Assign parameter to instance variable
        this.leader = leader; // Fixed: Assign parameter to instance variable
        this.map = map; // Fixed: Assign parameter to instance variable
        participants = new ArrayList<>();
    }

    /**
     * Adds participants to the quest.
     *
     */
    public void addParticipant(Character character) {
        participants.add(character);
    }

    /**
     * Starts the quest.
     *
     */

    public void start() {
        System.out.println("Starting quest: " + questName);
        System.out.println("Leader: " + leader.name + ", age: " + leader.age); // Fixed: Print leader's name and age
        System.out.println("Participants:");
        for (Character participant : participants) {
            System.out.println(participant.name + ", age: " + participant.age); // Fixed: Print participant's name and age
        }
    }
}
