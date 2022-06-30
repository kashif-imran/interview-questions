package synechron;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Example4 {
    public static void main(String[] args) {
        int N = 5;

        //N = 50; // variable must be final or effectively final(ie., it must not change once assigned)

        Predicate<Integer> greaterThanN = (Integer x) -> {
            System.out.println("Hello");
            return  x > N;
        };

        System.out.println(greaterThanN.test(100));

        BiPredicate<Integer, Integer> greaterThanY = (Integer x, Integer y) -> {
            System.out.println("Hello");
            return  x > y;
        };
    }
}
