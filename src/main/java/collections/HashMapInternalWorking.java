package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalWorking {
    public static void main(String[] args) {
        Map<String, String> employees = new HashMap<>();
        employees.put("Kashif", "12345");
        employees.put("Imran", "334423");

        employees.get("Kashif");

    }
}
