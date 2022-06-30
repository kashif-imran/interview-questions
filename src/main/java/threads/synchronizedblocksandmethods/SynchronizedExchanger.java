package threads.synchronizedblocksandmethods;

public class SynchronizedExchanger {

    protected Object object = null;

    //declaring a instance method with synchronized keyword means only one thread can
    //execute it at a time on a given instance of a class
    public synchronized void setObject(Object object) {
        this.object = object;
    }

    //if two methods of a class are declared synchronized then only one of them will execute at a time
    // on a given instance of a class
    public synchronized Object getObject() {
        return this.object;
    }

    public void setObj(Object o) {
        synchronized (this) { // A synchronized block can also be executed by only one thread at a time. (this)
                              // is called a monitor object on which this block is synchronized.
                              // as we are using this as monitor object and all code inside the method is inside the synchronized block.
                              // The effect of setObject and setObj is same
            this.object = o;
        }
    }

    public Object getObj() {
        synchronized (this) {
            return this.object;
        }
    }
}
