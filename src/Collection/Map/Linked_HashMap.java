package Collection.Map;
import java.util.LinkedHashMap;
import java.util.Map;
public class Linked_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> ages = new LinkedHashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 20);
        System.out.println("All ages in order: " + ages);
    }
}
//remembers the order in which we are storing