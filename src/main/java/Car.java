public class Car extends Terrestrial{

    private boolean isElectricVehicle;

    public Car(String name, boolean isElectricVehicle) {
        super(name);
        this.isElectricVehicle = isElectricVehicle;
    }

    @Override
    public String handbrakeDrift() {
        return "Nah";
    }
}
