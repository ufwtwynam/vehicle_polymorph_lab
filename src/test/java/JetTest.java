import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JetTest {

    Jet jet;

    @BeforeEach
    void setUp() {
        jet = new Jet("F35", "Kerosene");
    }

    @Test
    void canRetractWheels() {
        assertThat(jet.retractWheels()).isEqualTo("stealthy");
    }
}
