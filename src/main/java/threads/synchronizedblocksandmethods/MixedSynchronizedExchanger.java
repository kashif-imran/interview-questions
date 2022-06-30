package threads.synchronizedblocksandmethods;

public class MixedSynchronizedExchanger {

    public static Object staticObj = null;
    public Object instanceObj = null;

    //synchronized on class object
    public static synchronized void setStaticObj(Object obj) {
        staticObj = obj;
    }

    //synchronized on instance object this
    public synchronized void setInstanceObj(Object obj) {
        this.instanceObj = obj;
    }

    // both the methods are not synchronized as they dont share same monitor
}
