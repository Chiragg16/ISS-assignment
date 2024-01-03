import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

class Collections {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Shubham");
        arrayList.add("Arun");
        arrayList.add("Chirag");

        // Iterating through elements
        for (String element : arrayList) {
            System.out.println(element);
        }
//****************************************************************/
        Set<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("Shubham");
        hashSet.add("Arun");
        hashSet.add("Chirag");

        // Iterating through elements
        for (String element : hashSet) {
            System.out.println(element);
        }
//**************************************************************/
        Map<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put(1, "Shubham");
        hashMap.put(2, "Arun");
        hashMap.put(3, "Chirag");

        // Iterating through key-value pairs
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}


