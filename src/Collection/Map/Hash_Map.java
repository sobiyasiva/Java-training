package Collection.Map;
import java.util.HashMap;
import java.util.Map;
public class Hash_Map {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);  
        ages.put("Charlie", 20);
        System.out.println("Alice's age: " + ages.get("Alice"));
        System.out.println("All ages: " + ages);
    } 
}
//key-name,value-age