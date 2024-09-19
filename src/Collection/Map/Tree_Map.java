package Collection.Map;
import java.util.Map;
import java.util.TreeMap;
public class Tree_Map {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<>();
        ages.put("Bob", 30);
        ages.put("Charlie", 20);
        ages.put("Alice", 25);
        System.out.println("All ages (sorted by name): " + ages);
    }
}
//sorts the order alphabetically
//put(key, value): Adds a key-value pair to the map.
//get(key): Retrieves the value associated with a specific key.
//remove(key): Removes the key-value pair for a given key.
//containsKey(key): Checks if the map contains a certain key.
//containsValue(value): Checks if the map contains a certain value.
//size(): Returns the number of key-value pairs in the map.
//keySet(): Returns a set of all the keys in the map.
//values(): Returns a collection of all the values in the map.