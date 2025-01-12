import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class MotorsportsTest {

    @Test
    void testPitStop() {
        // Create an ArrayList to hold SingleSeater objects
        ArrayList<SingleSeater> singleSeaters = new ArrayList<>();

        // Add an instance of FormulaOne to the list
        FormulaOne formulaOneCar = new FormulaOne("Formula 1 Car", 8, 4, true, 0, "378 km/h");
        singleSeaters.add(formulaOneCar);

        // Verify initial state before pit stop
        assertEquals(0, formulaOneCar.tyresUsed, "Initial tyresUsed should be 0");

        // Perform a pit stop
        for (SingleSeater car : singleSeaters) {
            car.pittStop();
        }

        // Verify the state after pit stop
        assertEquals(4, formulaOneCar.tyresUsed, "After pit stop, tyresUsed should be 4");
    }
}