package org.example;



class RentalRecord {
    private int rentalPeriod;
    private double rentalPrice;
    private String lessor;
    private AbstractVehicle vehicle;

    public RentalRecord(int rentalPeriod, double rentalPrice, String lessor, AbstractVehicle vehicle) {
        this.rentalPeriod = rentalPeriod;
        this.rentalPrice = rentalPrice;
        this.lessor = lessor;
        this.vehicle = vehicle;
    }

    // Getters
    public int getRentalPeriod() {
        return rentalPeriod;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public String getLessor() {
        return lessor;
    }

    public AbstractVehicle getVehicle() {
        return vehicle;
    }
}