package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReusableStreamUsingSupplier {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       Supplier<Stream<Integer>> evenListSupplier = () -> list.parallelStream().filter(x -> x % 2 == 0);

       //Parallel stream - fork-join pool; work stealing pool
        // parallel stream and collecting into concurrenthashmap can be faster for large input





       evenListSupplier.get().forEach(System.out::println);
        System.out.println("-----------------------------------------");

       evenListSupplier.get().filter(e -> e > 3).forEach(System.out::println);
    }
}
