package interview_programs;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciWithMemoisation {

    static  int[] calculatedFib = new int[50];

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        int n = new Scanner(System.in).nextInt();
        int fibOfN = fib(n);
        System.out.println( fibOfN);
        System.out.println(Arrays.toString(calculatedFib));
    }

    private static int fib(int n) {
        if(n <= 1) {
            return n;
        } else {
            if(calculatedFib[n] != 0) {
                return calculatedFib[n];
            }
            calculatedFib[n] =  fib(n - 1) + fib(n - 2);
            return calculatedFib[n];
        }
    }
}
