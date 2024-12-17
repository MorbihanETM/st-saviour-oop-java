public class SingleSeater extends Motorsports {

    public int tyresUsed = 0;
    
    public SingleSeater(String name, int gear, int tyresOn, boolean singleSeater, String maxRecordedSpeed) {
        super(name, gear, maxRecordedSpeed);
        singleSeater = true;
        tyresOn = 4;
    }

    public void pittStop() {
        this.tyresUsed += 4;
    }

}