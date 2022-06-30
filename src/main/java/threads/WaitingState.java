package threads;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaitingState implements Runnable {
    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new WaitingState(), "WaitingState");
        t1.start();
    }

    public void run() {
        Thread t2 = new Thread(new DemoThreadWS(), "DemoThreadWS");
        t2.start();

        try {
            t2.join(); //Waits for this thread to die.
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            log.error("Thread interrupted", e);
        }
    }
}

@Slf4j
class DemoThreadWS implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            log.error("Thread interrupted", e);
        }

        log.info(String.format("Thread: %s, State: %s", WaitingState.t1.getName(), String.valueOf(WaitingState.t1.getState())));
        log.info(String.format("Thread: %s, State: %s", Thread.currentThread().getName(), String.valueOf(Thread.currentThread().getState())));
    }
}
