package threads;

public class ThreadExample3 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + " running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " finished");
        };
        Thread t1 = new Thread(runnable);
        t1.start();

    }
}
