package synechron;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(Integer.MIN_VALUE, -1L));
        System.out.println(add(1, 2, 3));
    }

    private static int add(int i, int j, int k) { //overflow and underflow issue
        return i + j + k;
    }

    private static long add(int i, int j) {
        return (long) i + j;
    }

    private static long add(long i, int j) {
        return (long) i + j;
    }

    private static long add(int j, long i) {
        return (long) i + j;
    }

    private static long add(int... i) { //if it doesnt find any exact match then it will call this
        long sum = 0;
        for(int n: i) {
            sum += n;
        }
        return sum;
    }
}
