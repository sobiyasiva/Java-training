class Engine {
    public void start() {
        System.out.println("Engine has started.");
    }
    public void stop() {
        System.out.println("Engine has stopped.");
    }
}
class Car {
    private Engine engine; 
    public Car() {
        engine = new Engine();  
    }
    public void startCar() {
        engine.start(); 
        System.out.println("Car has started.");
    }
    public void stopCar() {
        engine.stop();  
        System.out.println("Car has stopped.");
    }
}
public class Composition {
    public static void main(String[] args) {
        Car myCar = new Car();  
        myCar.startCar();     
        myCar.stopCar();        
    } 
}
//  private Engine engine;-this is more important here bz it says the engine is hidden inside the car .i.e private
//the car can be usable but cannot be changed from outside