import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        
        map.put("Rajesh", 23);
        map.put("Avinash", 33);
        map.put("Ravi", 19);

        // System.out.println(map.get("suresh"));
        
        // map.remove("Rajesh");
        // System.out.println(map.containsKey("Rajes"));
        // System.out.println(map.containsValue(19));


        // Set<String> array = map.keySet();
        // System.out.println(array);
        // System.out.println(map);

        // System.out.println(map.values());
        // System.out.println(map.entrySet());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        
    }
}