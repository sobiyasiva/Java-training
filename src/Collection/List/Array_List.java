package Collection.List;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[]args){
        ArrayList<String> toyBag = new ArrayList<>();
        toyBag.add("Car");
        toyBag.add("Doll");
        toyBag.add("Ball");
        System.out.println("Toys in the bag: " + toyBag);
        System.out.println("The toy at index 1 is: "+toyBag.get(1)) ;
        toyBag.set(1,"Super Doll");
        System.out.println("Toys after changing index 1: "+toyBag);
        toyBag.remove(2);
        System.out.println("Toys after removing index 2: "+toyBag);
        toyBag.remove("Car");
        System.out.println("Toys after removing 'Car': "+toyBag);
    }
}
