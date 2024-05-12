package org.example;

/**
 * Represents a quest in the lord of the rings world
 */
public class Quest {
    /**
     * Completes a quest based on points
     *
     * @param points       The points earned in the quest
     * @param isRingBearer True if the player is the ring bearer, false otherwise.
     * @return True if the quest is completed, false otherwise.
     */
    public boolean completeQuest(int points, boolean isRingBearer) {
        boolean isQualified = points > 0 && isRingBearer || points < -100 || points == 42;

        if (points > 50) {
            if (points < 100) {
                if (points % 2 == 0) {
                    if (isQualified) {
                        System.out.println("Qualified");
                    }
                }
            }
        }

        return points >= 100;
    }

    /**
     * Attempts to destroy the One Ring if the player has the fellowship and strength.
     *
     * @param hasFellowship True if the player has the fellowship, false otherwise
     * @param hasStrength   True if the player has the strength, false otherwise
     * @return True if the One Ring is destroyed, false otherwise
     */
    public boolean eradicteEvil(boolean hasFellowship, boolean hasStrength) {
        boolean canDestroy = hasFellowship && hasStrength;

        if (canDestroy) {
            System.out.println("One Ring Destroyed!");
        }

        return canDestroy;
    }

    /**
     * Attempts to defend Helm's Deep if the player has armies and the enemy forces are manageable.
     *
     * @param hasArmies   True if the player has armies, false otherwise.
     * @param enemyForces The number of enemy forces attacking Helm's Deep.
     * @return True if Helm's Deep is successfully defended, false otherwise.
     */
    public boolean protectCastle(boolean hasArmies, int enemyForces) {
        boolean canDefend = hasArmies && enemyForces <= 600;

        if (canDefend) {
            System.out.println("Castle Defended!");
        }

        return canDefend;
    }
}