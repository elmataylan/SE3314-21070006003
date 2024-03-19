package org.example;



class LuxuryCarRental extends AbstractVehicle implements FeaturesInterface {
    private boolean hasGPS;
    private boolean hasLeatherSeats;

    @Override
    public double calculateAdditionalCost(int rentalDays) {
        double totalCost = getBasePrice() * rentalDays;
        if (hasGPS) {
            totalCost += 20 * rentalDays;
        }
        if (hasLeatherSeats) {
            totalCost += 30 * rentalDays;
        }
        return totalCost;
    }

    public LuxuryCarRental(String brand, String model, String licensePlate, double basePrice,
                           boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate, basePrice);
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
    }

    @Override
    public double calculateTotalPrice(int rentalDays) {
        double totalCost = getBasePrice() * rentalDays;
        if (hasGPS) {
            totalCost += 20 * rentalDays;
        }
        if (hasLeatherSeats) {
            totalCost += 30 * rentalDays;
        }
        return totalCost;
    }
}
