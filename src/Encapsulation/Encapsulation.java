package Encapsulation;
class ToyCar {
    private int speed;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int newSpeed) {
        if (newSpeed >= 0) {  
            speed = newSpeed;
        } else {
            System.out.println("Speed cannot be negative!");
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        ToyCar myCar = new ToyCar(); 
        myCar.setSpeed(10);
        System.out.println("Car speed: " + myCar.getSpeed());  
        myCar.setSpeed(-5); 
        System.out.println("Car speed: " + myCar.getSpeed()); 
    }
}
//here we need to modify speed,so making speed as a private
//getting and setting the speed
