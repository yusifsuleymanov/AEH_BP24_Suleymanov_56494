package pl.pp;

public class Warehouse {
    private int warehouseNumber;
    private int availableSpace;
    private String ownerName;
    private String email;
    private String phoneNumber;

    public Warehouse(int warehouseNumber, int availableSpace, String ownerName, String email, String phoneNumber) {
        this.warehouseNumber = warehouseNumber;
        this.availableSpace = availableSpace;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public int getWarehouseNumber() { return warehouseNumber; }
    public int getAvailableSpace() { return availableSpace; }
    public String getOwnerName() { return ownerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    // Setters
    public void setWarehouseNumber(int warehouseNumber) { this.warehouseNumber = warehouseNumber; }
    public void setAvailableSpace(int availableSpace) { this.availableSpace = availableSpace; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Methods
    public void addGoods(int amount) {
        if (amount <= availableSpace) {
            availableSpace -= amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
        } else {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + availableSpace + " units.");
        }
    }

    public void removeGoods(int amount) {
        int occupiedSpace = 5000 - availableSpace;
        if (amount <= occupiedSpace) {
            availableSpace += amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
        } else {
            System.out.println("Cannot remove more goods than stored. Occupied warehouse space: " + occupiedSpace + " units.");
        }
    }

    public void checkOccupancy() {
        int occupied = 5000 - availableSpace;
        System.out.println("Occupied warehouse space: " + occupied + " units.");
        System.out.println("Available warehouse space: " + availableSpace + " units.");
    }

    public void updateContact(String newEmail, String newPhone) {
        this.email = newEmail;
        this.phoneNumber = newPhone;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + email);
        System.out.println("New phone number: " + phoneNumber);
    }
}
