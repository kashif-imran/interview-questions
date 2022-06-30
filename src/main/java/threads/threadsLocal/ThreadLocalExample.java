package threads.threadsLocal;

//The TheadLocal construct allows us to store data that will be accessible only by a specific thread.
public class ThreadLocalExample {

    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();
        //Next, when we want to use this value from a thread,
        // we only need to call a get() or set() method. Simply put, we can imagine that
        // ThreadLocal stores data inside of a map with the thread as the key.

        threadLocalValue.set(1);
        System.out.println(threadLocalValue.get());

        //We can construct an instance of the ThreadLocal by using the withInitial() static method and passing a supplier to it:

        ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> "abc");

        threadLocal.remove();


    }
}
