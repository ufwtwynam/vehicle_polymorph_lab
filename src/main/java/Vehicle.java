public abstract class Vehicle {

    protected String name;
    protected double maxOccupancy;
    protected int numOfWheels;
    protected double co2EmissionPerPassenger;
    protected double value;

    public Vehicle(String name) {
        this.name = name;
        this.maxOccupancy = 0;
        this.numOfWheels = 0;
        this.co2EmissionPerPassenger = 0;
        this.value = 0;
    }

    public double getValue() {
        return value;
    }
    public double totalCo2EmissionPerVehicle() {
        return (this.maxOccupancy * this.co2EmissionPerPassenger);
    }

}
