package synechron;

import java.util.Arrays;
import java.util.Comparator;

public class NthHighestNumberInArray {
    public static void main(String[] args) {
        Integer[] arr = {10, 30, 25, 45, 64, 60, 60, 33, 22};

        int n = 3;

        Integer nthHighestNumber = Arrays.stream(arr)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(n - 1)
                .findFirst()
                .get();
        System.out.format("%d  highest number in the array is %d",  n, nthHighestNumber);
    }
}
