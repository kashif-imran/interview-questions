package interview_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        hashmap.put(22,"A");
        hashmap.put(55,"B");
        hashmap.put(33,"Z");
        hashmap.put(44,"M");
        hashmap.put(99,"I");
        hashmap.put(88,"X");

        Stream<Map.Entry<Integer, String>> sortedSet = hashmap.entrySet().stream().sorted((e1, e2) -> {
            return e1.getValue().compareTo(e2.getValue());
        });

        sortedSet.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
