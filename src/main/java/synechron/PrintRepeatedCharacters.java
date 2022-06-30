package synechron;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintRepeatedCharacters {
    public static void main(String[] args) {
        String str = "Gaining experience with programming";
        java8Solution(str);
        withOutJava8(str);
    }

    private static void java8Solution(String str) {
        str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()))
                .forEach((k, v) -> {
                    if(v > 1) {
                        System.out.println(k + " : " + v);
                    }
                });
    }

    private static void withOutJava8(String str) {
        // create a HashMap
        Map< Character, Integer > countDuplicateMap = new HashMap< >();

        // Converts this string to a new character array.
        char[] charArray = str.toCharArray();

        for (char c: charArray) {

            if (countDuplicateMap.containsKey(c)) {

                // get value by key and increment it's value by a
                countDuplicateMap.put(c, countDuplicateMap.get(c) + 1);
            } else {
                countDuplicateMap.put(c, 1);
            }
        }


        for (Map.Entry< Character, Integer > entry: countDuplicateMap.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
