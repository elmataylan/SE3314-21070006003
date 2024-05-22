package org.example;

public class MiddleEarthMap {
    /**
     * The function for navigate characters between maps secretly or not
     * @param location
     * @param isSecretPassage
     */
    public void navigate(final String location, final boolean isSecretPassage) { // FinalLocalVariable
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case "Shire":
                System.out.println("Navigating to the Shire");
                break;
            case "Gondor":
                System.out.println("Navigating to Gondor");
                break;
            case "Lothlórien":
                System.out.println("Navigating to Lothlórien");
                break;
            default:
                System.out.println("Unknown location");
        }

        final String result = isSecretPassage ? "Secret" : "Normal"; // FinalLocalVariable
        System.out.println(result);
    }
}
