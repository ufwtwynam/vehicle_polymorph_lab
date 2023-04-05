import interfaces.IFly;

public class Propeller extends Air implements IFly {

    private String fuelType;
    public Propeller(String name, String fuelType) {
        super(name);
        this.fuelType = fuelType;
    }

    @Override
    public String retractWheels() {
        return "noisy and shaky";
    }

    @Override
    public String fly(int distance) {
        return this.name + " flew " + distance + "m";
    }
}
