import org.json.JSONObject;

public class JsonObj {
    public static void main(String[] args) {
        // Create a JSON object
        JSONObject jsonObject = new JSONObject();

        // Insert data into the JSON object
        jsonObject.put("name", "Chirag");
        jsonObject.put("age", 21);
        jsonObject.put("city", "Mumbai");

        // Print the JSON object
        System.out.println(jsonObject.toString());
    }
}
