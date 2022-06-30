package threads.synchronizedblocksandmethods;

import java.util.stream.IntStream;

public class ReentranceTest {

    int count = 0;

    static{
        System.out.println("Inside SIB");
    }

    {
        System.out.println("Inside IIB");
    }

    /*
        A class can be declared static only if it is a nested class
        The property of the static class is that it does not allows us to access the non-static members of the outer class.

        Note:
        1. An instance of the static nested class can be created without creating an instance of its outer class.
        2. The static and non-static members of an outer class can be accessed by an non-static inner class.
        3. Only the static members of the outer class can be accessed by the static class.
           Non-static variable and instance methods cannot be accessed within the static class.
           If you try to access a non-static reference from a static field,
           it throws an error: Cannot make a static reference to the non-static field.
        4. We cannot access the static class if it is inside the static block.
        5. We can have static and non static methods and classes inside a static class.
        6. The static classes are loaded by the classloader at the time of the first usage only not when is enclosing class gets loaded.
    */
    static class Reentrance {

        private int count = 0;

        public synchronized void inc() {
            this.count++;
        }

        /*
        Synchronized blocks in Java are reentrant. This means, that if a Java thread enters a synchronized block of code,
         and thereby take the lock on the monitor object the block is synchronized on, the thread can enter other Java code blocks
          synchronized on the same monitor object.

          iIn out example if the thread enters a synchronized block incAndGet which takes lock of monitor object Reentrance.class.
          thread can enter other java code blocks inc() which is synchronized on the same monitor object
         */
        public synchronized int incAndGet() {
            inc();
            return this.count;
        }
    }
    public static void main(String[] args) {
        Reentrance reentrance = new Reentrance();
        IntStream.range(0, 100)
                .forEach(i -> System.out.println(reentrance.incAndGet()));
    }
}
