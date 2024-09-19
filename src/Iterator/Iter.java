package Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Iter {
    public static void main(String[] args) {
        List<String> toyBag=new ArrayList<>();
        toyBag.add("Car");
        toyBag.add("Doll");
        toyBag.add("Ball");
        toyBag.add("Robot");
        Iterator<String> toyIterator = toyBag.iterator();
        while(toyIterator.hasNext()){
            String toy=toyIterator.next();
            System.out.println("Playing with: "+toy);
            if(toy.equals("Doll")){
                toyIterator.remove();
                System.out.println("Doll has been removed");
            }
        }
        System.out.println("Toys left in the bag: "+toyBag);
    } 
}
