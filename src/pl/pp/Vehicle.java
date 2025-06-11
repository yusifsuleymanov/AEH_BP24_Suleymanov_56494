package pl.pp;

public abstract class Vehicle {
    protected String registrationNumber;
    protected String vinNumber;
    protected String color;
    protected double price;
    protected double fuelConsumption;
    protected double fuelLevel;
    protected double mileage;

    public Vehicle(String registrationNumber, String vinNumber, String color, double price,
                   double fuelConsumption, double fuelLevel, double mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    public void drive(double distance) {
        double fuelNeeded = (distance / 100) * fuelConsumption;
        if (fuelLevel >= fuelNeeded) {
            fuelLevel -= fuelNeeded;
            mileage += distance;
            System.out.println("Drove " + distance + " km.");
        } else {
            System.out.println("Not enough fuel to drive " + distance + " km.");
        }
    }

    public void refuel(double fuelAmount) {
        fuelLevel += fuelAmount;
        System.out.println("Refueled " + fuelAmount + " liters.");
    }
}
