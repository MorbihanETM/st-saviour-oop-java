
// Create public class which extends Motorsports
public class NotSingleSeater extends Motorsports {
    
    // Set properties to private
    private String name;
    private int gear;
    private int tyresOn;
    private boolean singleSeater;
    private String maxRecordedSpeed;

    // Constructor
    public NotSingleSeater(String name, int gear, int tyresOn, boolean singleSeater, String maxRecordedSpeed) {
        super(name, gear, tyresOn, singleSeater = false, maxRecordedSpeed);
        this.name = name;
        this.gear = gear;
        this.tyresOn = tyresOn;
        this.singleSeater = false; 
        this.maxRecordedSpeed = maxRecordedSpeed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getGear() {
        return gear;
    }

    public int getTyresOn() {
        return tyresOn;
    }

    public boolean isSingleSeater() {
        return singleSeater;
    }

    public String getMaxRecordedSpeed() {
        return maxRecordedSpeed;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setTyresOn(int tyresOn) {
        this.tyresOn = tyresOn;
    }

    public void setSingleSeater(boolean singleSeater) {
        this.singleSeater = singleSeater;
    }

    public void setMaxRecordedSpeed(String maxRecordedSpeed) {
        this.maxRecordedSpeed = maxRecordedSpeed;
    } 
}

