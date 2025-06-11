package pl.pp;

public class RentalTest {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("ABC123", "VIN0001", "Red", 30000, 6.5, 40, 12000, 4, "Gasoline");
        car.drive(150);
        car.refuel(20);
        System.out.println("Car Fuel Type: " + car.getFuelType());

        Truck truck = new Truck("TRK789", "VIN0002", "Blue", 50000, 15, 80, 50000, 10000, "Diesel");
        truck.drive(200);
        truck.refuel(50);
        System.out.println("Truck Fuel Type: " + truck.getFuelType());

        Motorcycle moto = new Motorcycle("MOTO321", "VIN0003", "Black", 10000, 3.5, 10, 8000, false, "Gasoline");
        moto.drive(50);
        moto.refuel(5);
        System.out.println("Motorcycle Fuel Type: " + moto.getFuelType());

        ConstructionEquipment machine = new ConstructionEquipment("EQ999", "VIN0004", "Yellow", 75000, 12, 30, 2000, 1200, "Diesel");
        machine.drive(75);
        machine.refuel(25);
        System.out.println("Equipment Fuel Type: " + machine.getFuelType());
    }
}
