
// Create public class which extends Motorsports
public class SingleSeater extends Motorsports {

    public int tyresUsed = 0; // Create new property
    
    // Constructor
    public SingleSeater(String name, int gear, int tyresOn, boolean singleSeater, String maxRecordedSpeed) {
        super(name, gear, 4, true, maxRecordedSpeed);
    }

    // Create pittStop method
    public void pittStop() {
        this.tyresUsed += 4;
    }
}