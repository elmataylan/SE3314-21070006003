package org.example;




class EconomyCarRental extends AbstractVehicle implements FeaturesInterface {
    private boolean isHybrid;

    public EconomyCarRental(String brand, String model, String licensePlate, double basePrice,
                            boolean isHybrid) {
        super(brand, model, licensePlate, basePrice);
        this.isHybrid = isHybrid;
    }

    @Override
    public double calculateAdditionalCost(int rentalDays) {
        if (isHybrid) {
            return 10 * rentalDays;
        } else {
            return 0;
        }
    }

    @Override
    public double calculateTotalPrice(int rentalDays) {
        double totalCost = getBasePrice() * rentalDays;
        if (isHybrid) {
            totalCost += 10 * rentalDays;
        }
        return totalCost;
    }
}