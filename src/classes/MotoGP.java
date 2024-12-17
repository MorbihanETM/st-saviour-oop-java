public class MotoGP extends NotSingleSeater{
    
    public MotoGP (String name, int gear, int tyresOn, boolean singleSeater, String maxRecordedSpeed){
        super(gear, singleSeater);
        name = motoGP;
        tyresOn = 2;
        maxRecordedSpeed = "366.1km/h";
    }
}
