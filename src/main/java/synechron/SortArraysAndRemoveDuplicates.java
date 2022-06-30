package synechron;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortArraysAndRemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr1 = {2, 3, 4};
        Integer[] arr2 = {5, 10, 3};

        Integer[] merged = Stream.of(arr1, arr2)
                .flatMap(Stream::of)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);


    }
}
