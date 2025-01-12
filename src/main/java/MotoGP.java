
// Create public class which extends NotSingleSeater
public class MotoGP extends NotSingleSeater {

    // Constructor
    public MotoGP(String name, int gear, int tyresOn, boolean singleSeater, String maxRecordedSpeed) {
        super(name, gear, tyresOn, singleSeater, maxRecordedSpeed);
        setName("motoGP");
        setTyresOn(2);
        setMaxRecordedSpeed("366.1km/h");
    }
}