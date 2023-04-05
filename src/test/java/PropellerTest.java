import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class PropellerTest {

    Propeller propeller;

    @BeforeEach
    void setUp() {
        propeller = new Propeller("Firefly", "Avgas");
    }

    @Test
    void canRetractWheels() {
        assertThat(propeller.retractWheels()).isEqualTo("noisy and shaky");
    }
}
