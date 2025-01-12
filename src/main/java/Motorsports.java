
// Create abstract public class with its properties
public abstract class Motorsports { 
    
    public String name;
    public int gear;
    public int tyresOn;
    public String maxRecordedSpeed;
    public boolean singleSeater;

    // Constructor method
    public Motorsports(String name, int gear, int tyresOn, boolean singleSeater, String maxRecordedSpeed){
        this.name = name;
        this.gear = 0;
        this.tyresOn = tyresOn;
        this.singleSeater = singleSeater;
        this.maxRecordedSpeed = maxRecordedSpeed;
    }
}
