package threads.synchronizedblocksandmethods;

public class MultipleMonitorObjects {

    /*
        we must not use strings or primitive types as monitor objects.
     */

    private Object monitor1 = new Object();
    private Object monitor2 = new Object();

    private int counter1 = 0;
    private int counter2 = 0;

    public void incCounter1() {
        synchronized (this.monitor1) {
            this.counter1++;
        }
    }

    public void incCounter2() {
        synchronized (this.monitor2) {
            this.counter2++;
        }
    }

}
