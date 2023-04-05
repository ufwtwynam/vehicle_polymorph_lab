import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CompoundTest {

    Compound compound;

    @BeforeEach
    void setUp() {
        compound = new Compound();
    }

    @Test
    void canCountVehicles() {
        assertThat(compound.countVehicles()).isEqualTo(0);
    }

    @Test
    void canAddVehicle() {
        Car car = new Car("Tesla",true);
        compound.addVehicle(car);
        assertThat(compound.countVehicles()).isEqualTo(1);
    }

    @Test
    void canAddMultipleVehicles() {
        Car car = new Car("Tesla", true);
        Jet jet = new Jet("F35", "Kerosene");
        compound.addVehicle(car);
        compound.addVehicle(jet);
        assertThat(compound.countVehicles()).isEqualTo(2);
    }

    @Test
    public void canCalculateTotalVehiclePrice() {
        assertThat(compound.calculateTotalVehicleValue()).isEqualTo(0);
    }

    @Test
    public void totalValueStartsAtZero() {
        assertThat(compound.getTotalValue()).isEqualTo(0);
    }

    @Test
    public void canMakeNoise() {
        assertThat(compound.makeNoise()).isEqualTo("zoom zoom");
    }
}
