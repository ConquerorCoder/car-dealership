import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
   private String name;
   private String address;
   private String phone;


    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }
    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }
    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }
    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }
    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }
    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }
    public void removeVehicle(Vehicle vehicle) {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }
}
