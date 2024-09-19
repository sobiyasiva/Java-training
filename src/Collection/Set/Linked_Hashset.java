package Collection.Set;
import java.util.LinkedHashSet;
import java.util.Set;
public class Linked_Hashset {
    public static void main(String[] args) {
        Set<String> toySet = new LinkedHashSet<>();
        toySet.add("Ball");
        toySet.add("Car");
        toySet.add("Doll");
        toySet.add("Car");  
        System.out.println("Toys in the set: " + toySet);
    } 
}
//LinkedHashSet remembers the order in which we add the values if we return the values the same order will returns