package Collection.Set;
import java.util.HashSet;
import java.util.Set;
public class Hash_Set {
    public static void main(String[] args) {
        Set<String> toySet = new HashSet<>();
        toySet.add("Ball");
        toySet.add("Car");
        toySet.add("Doll");
        toySet.add("Car"); 
        System.out.println("Toys in the set: " + toySet);
    }
}
