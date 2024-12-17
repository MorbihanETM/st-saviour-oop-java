public abstract class Motorsports {
    
    public String name;
    public int gear;
    public int tyresOn;
    public String maxRecordedSpeed;
    public boolean singleSeater;

    public Motorsports(String name, int gear, int tyresOn, boolean singleSeater, String maxRecordedSpeed){
        this.name = name;
        this.gear = 0;
        this.tyresOn = tyresOn;
        this.singleSeater = singleSeater;
        this.maxRecordedSpeed = maxRecordedSpeed;
    }

    
    

}
