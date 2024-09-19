class Engine {
    // Engine properties and behaviors
}

class Wheels {
    // Wheels properties and behaviors
}

class Car {
    private Engine engine;
    private Wheels wheels;
    
    public Car() {
        this.engine = new Engine();
        this.wheels = new Wheels();
    }
    
    public void drive() {
        System.out.println("Car is driving!");
    }
}

//using one class object inside the other class-composition
//  private Engine engine;-this is more important here bz it says the engine is hidden inside the car .i.e private
//the car can be usable but cannot be changed from outside