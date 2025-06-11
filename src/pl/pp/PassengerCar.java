package pl.pp;

public class PassengerCar extends Vehicle implements FuelType {
    private final int numberOfDoors;
    private final String fuelType;

    public PassengerCar(String registrationNumber, String vinNumber, String color, double price,
                        double fuelConsumption, double fuelLevel, double mileage,
                        int numberOfDoors, String fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
