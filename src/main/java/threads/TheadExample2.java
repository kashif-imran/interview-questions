package threads;

public class TheadExample2 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
          String name = Thread.currentThread().getName();
            System.out.println(name + " running");
        };
        Thread t1 = new Thread(runnable, "The Thread 1");
        t1.start();

        Thread t2= new Thread(runnable, "The Thread 2");
        t2.start();

    }
}
