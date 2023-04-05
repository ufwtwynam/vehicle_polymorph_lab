import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Tesla", true);
    }

    @Test
    void cantHandbrakeDrift() {
        assertThat(car.handbrakeDrift()).isEqualTo("Nah");
    }
}
