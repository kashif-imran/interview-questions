package threads;

/*
Java thread will continue to run till it completes its operations in run() method even if the main method is terminated.
If you want the threads to stop after the main thread has stopped then mark them as daemon by setDaemon(true);
 */
public class ThreadExample5 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while(true) {
                ThreadUtils.sleep(1000);
                System.out.println("Running");
            }
        };

        Thread t1 = new Thread(runnable);
        t1.setDaemon(true); // threads to stop immediately after the main thread has stopped
        t1.start();
        ThreadUtils.sleep(3000); // main thead sleep
    }
}
