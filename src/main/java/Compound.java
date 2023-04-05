import java.util.ArrayList;

public class Compound {

//      total value of vehicles in the compound
    private double totalValue;
//      collection to accept objects
    private ArrayList<Vehicle> collection;


//      constructor
    public Compound() {
        this.collection = new ArrayList<>();
        this.totalValue = 0;
    }

//      methods for testing
    public int countVehicles() {
        return this.collection.size();
    }

    public void addVehicle(Vehicle vehicle) {
        this.collection.add(vehicle);
    }

    public double calculateTotalVehicleValue() {
        double total = 0;
        for (Vehicle vehicle : this.collection) {
            total += vehicle.getValue();
        }
        return total;
    }

//    Getter for test to make sure compound total vehicle price starts at zero
    public double getTotalValue() {
        return totalValue;
    }

    public String makeNoise() {
        return "zoom zoom";
    }








}
