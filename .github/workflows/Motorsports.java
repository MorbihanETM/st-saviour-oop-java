public class Motorsports {
    
    public String name;
    public int gear;
    public int tyresOn;
    public boolean singleSeater;

    public Motorsports(String name, int gear, int tyresOn, boolean singleSeater){
        this.name = name;
        this.gear = gear;
        this.tyresOn = tyresOn;
        this.singleSeater = singleSeater;
    }

    public void gearChange(){
        this.gear += 1;
    }
    
}
