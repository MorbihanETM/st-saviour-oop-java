import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PolymorphismTest {
    @Test
    void testPolymorphicBehavior() {
        // Create an instance of FormulaOne
        Motorsports motorsport = new FormulaOne("Formula 1 Car", 8, 4, true, 0, "378 km/h");

        // Assert that motorsport is an instance of FormulaOne, SingleSeater, and Motorsports
        assertTrue(motorsport instanceof FormulaOne);
        assertTrue(motorsport instanceof SingleSeater);
        assertTrue(motorsport instanceof Motorsports);

        // Confirm presence of inherited properties
        assertEquals("formulaOne", motorsport.name);
        assertEquals(4, motorsport.tyresOn);
        assertEquals("378 km/h", motorsport.maxRecordedSpeed);

        // Downcast to FormulaOne and call pittStop method to confirm inherited method functionality
        if (motorsport instanceof FormulaOne) {
            FormulaOne formulaOneCar = (FormulaOne) motorsport;
            assertEquals(0, formulaOneCar.tyresUsed);
            formulaOneCar.pittStop();
            assertEquals(4, formulaOneCar.tyresUsed);
        }
    }
}


