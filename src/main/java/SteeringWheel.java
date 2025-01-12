
// Implement public class which implements Gear interface
public class SteeringWheel implements Gear {

    public int gear = 1;

    public void up(){
        this.gear++;
    }
    
    public void down(){
        this.gear--;
    }
    
}
