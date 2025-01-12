import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SteeringWheelTest {

    @Test
    void testGearUp() {
        SteeringWheel steeringWheel = new SteeringWheel();

        // Initial gear should be 1
        assertEquals(1, steeringWheel.gear);

        // Call up() and check if the gear increments
        steeringWheel.up();
        assertEquals(2, steeringWheel.gear);

        // Call up() again
        steeringWheel.up();
        assertEquals(3, steeringWheel.gear);
    }

    @Test
    void testGearDown() {
        SteeringWheel steeringWheel = new SteeringWheel();

        // Initial gear should be 1
        assertEquals(1, steeringWheel.gear);

        // Call down() and check if the gear decrements
        steeringWheel.down();
        assertEquals(0, steeringWheel.gear);

        // Call down() again
        steeringWheel.down();
        assertEquals(-1, steeringWheel.gear);
    }

    @Test
    void testInterfaceImplementation() {
        SteeringWheel steeringWheel = new SteeringWheel();

        // Ensure SteeringWheel implements the Gear interface
        assertTrue(steeringWheel instanceof Gear);
    }
}