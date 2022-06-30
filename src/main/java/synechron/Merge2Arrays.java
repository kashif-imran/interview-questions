package synechron;

import java.util.Arrays;
import java.util.stream.Stream;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4};
        int[] arr2 = {5, 10, 3};

        int a1Length = arr1.length;
        int a2Length = arr2.length;
        int mergedArrayLength = a1Length + a2Length;
        Integer[] mergedArray = new Integer[mergedArrayLength];

        usingJava8(arr1, arr2);

        //usingSystemArrayCopy(arr1, arr2, a1Length, a2Length, mergedArray);
        //manual
        //manualMethod(arr1, arr2, a1Length, mergedArray);
    }

    private static void usingJava8(int[] arr1, int[] arr2) {
        Integer[] mergedArray;
        mergedArray = Stream.of(arr1, arr2)
                .flatMap(a -> Stream.of(a)) // flatmap outputs stream of collection or array
                .toArray(Integer[]::new);

        //or
        mergedArray = Stream.concat(Stream.of(arr1), Stream.of(arr2))
                        .toArray(Integer[]::new);
    }

    private static void manualMethod(int[] arr1, int[] arr2, int a1Length, int[] mergedArray) {
        for(int i=0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        for(int i=0; i < arr2.length; i++) {
            mergedArray[i + a1Length] = arr2[i];
        }
        System.out.println(Arrays.toString(mergedArray));
    }

    private static void usingSystemArrayCopy(int[] arr1, int[] arr2, int a1Length, int a2Length, int[] mergedArray) {
        System.arraycopy(arr1, 0, mergedArray, 0, a1Length);
        System.arraycopy(arr2, 0, mergedArray, a1Length, a2Length);

        System.out.println(Arrays.toString(mergedArray));
    }
}
