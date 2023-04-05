import interfaces.IFly;

public class Jet extends Air implements IFly {

    private String fuelType;
    public Jet(String name, String fuelType) {
        super(name);
        this.fuelType = fuelType;
    }

    @Override
    public String retractWheels() {
        return "stealthy";
    }


    @Override
    public String fly(int distance) {
        return this.name + " flew " + distance + "m";
    }
}
