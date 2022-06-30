package threads;

public class BlockedState {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new DemoThreadB(), "T1");
        Thread t2 = new Thread(new DemoThreadB(), "T2");

        t1.start();
        t2.start();

        Thread.sleep(1000);
        // if we dont sleep for 1 sec the code would'nt have entered run method and hence the state will still be RUNNABLE

        System.out.println(t2.getState());
        System.exit(0);
    }
}

class DemoThreadB implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        commonResource();
    }

    public static synchronized void commonResource() {
        while(true) {
            // Infinite loop to mimic heavy processing
            // 't1' won't leave this method
            // when 't2' try to enter this
        }
    }
}
