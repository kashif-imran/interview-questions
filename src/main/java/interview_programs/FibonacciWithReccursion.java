package interview_programs;

import java.util.Scanner;

public class FibonacciWithReccursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int fibOfN = fib(n);
        System.out.println( fibOfN);
    }

    private static int fib(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
