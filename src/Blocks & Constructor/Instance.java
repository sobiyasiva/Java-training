public class Instance{
    {
        System.out.println("Instance block: Runs before the constructor.");
        //runs every time when creating the object
    }
    public Instance() {
        System.out.println("Constructor: Runs after the instance block.");
        //runs after the instance block .ie.it also runs everytime when creating the object
    }
    public static void main(String[]args){
        System.out.println("Creating first object:");
        Instance obj1 = new Instance();
        System.out.println("\nCreating second object:");
        Instance obj2 = new Instance();
    }
}
//constructor automatically initialize values when we not manually initialize values to the variable or etc...
//without calling any method in the main constructor method automatically prints the value