package synechron;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        //java8Solution(10);

        //nonReccursinveSolution(10);

        reccursiveSolution(10);
    }

    private static void nonReccursinveSolution(int n) {
        int n1=0, n2=1, n3;

        System.out.print(String.format("%d, %d ", n1, n2));

        for(int i=2; i<n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }


    static List java8Solution(int length) {

        //Stream.iterate used to generate infinite stream of data
        // static(T seed, UnaryOperator<T> f)

        /*
        Practive iterate
        List<Integer> list = Stream.iterate(0, n -> n + 2)
                .limit(length)
                .collect(Collectors.toList());
        System.out.println(list);
        */
        List<Integer[]> list = Stream.iterate(new Integer[]{0, 1}, t -> new Integer[]{t[1], t[0] + t[1]})
                .limit(length)
                .collect(Collectors.toList());
        list.forEach(a -> System.out.println(Arrays.toString(a)));

        System.out.println("-------------------------");


        return Stream.iterate(new int[] {0, 1}, t -> new int[] {t[1], t[0] + t[1]})
                .limit(length)
                .map(t -> t[0])
                .collect(Collectors.toList());

    }

    private static void reccursiveSolution(int i) {
        //if(n)
    }
}
