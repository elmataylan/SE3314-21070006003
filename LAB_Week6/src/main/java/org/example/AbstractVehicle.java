package org.example;



abstract class AbstractVehicle {
    private String brand;
    private String model;
    private String licensePlate;
    private double basePrice;


    public AbstractVehicle(String brand, String model, String licensePlate, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.basePrice = basePrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract double calculateTotalPrice(int rentalDays);
}
