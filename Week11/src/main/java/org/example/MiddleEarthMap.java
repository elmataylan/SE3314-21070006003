package org.example;

/**
 * Represents a map of Middle Earth
 */
public class MiddleEarthMap {

    /**
     * Navigates to the specified location
     *
     * @param location        The location to navigate.
     * @param isSecretPassage True if the secret passage should be explored, false otherwise
     */
    public void navigate(char location, boolean isSecretPassage) {
        switch (location) {
            case 'M':
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case 'S':
                System.out.println("Navigating to the Shire");

                break;
            case 'G':
                System.out.println("Navigating to Gondor");

                break;
            case 'L':
                System.out.println("Navigating to Lothlórien");
                break;
            default:
                System.out.println("Unknown location");

                break;
        }
        if (isSecretPassage) {
            System.out.println("Entering secret area...");
        }

        
        String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }
}
