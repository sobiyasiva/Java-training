package Collection.Set;
import java.util.Set;
import java.util.TreeSet;
public class Tree_Set {
    public static void main(String[] args) {
        Set<String> toySet = new TreeSet<>();
        toySet.add("Ball");
        toySet.add("Car");
        toySet.add("Doll");
        toySet.add("Apple");
        System.out.println("Toys in the set (sorted): " + toySet);
    }
}
//return output in alphabetical order