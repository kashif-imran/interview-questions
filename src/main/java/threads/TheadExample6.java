package threads;

public class TheadExample6 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            int i=0;
            while(i < 5) {
                i++;
                ThreadUtils.sleep(1000);
                System.out.println("Running");
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();
        try {
            t1.join(); // waits for this thread to die before allowing the calling thread to continue.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method");
    }
}
