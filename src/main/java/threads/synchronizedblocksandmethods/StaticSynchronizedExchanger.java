package threads.synchronizedblocksandmethods;

public class StaticSynchronizedExchanger {

    protected static Object object = null;

    /*
        static synchronized method uses class object as monitor instead of instance object.
     */
    public static synchronized void setObject(Object object) {
        object = object;
    }


    public static synchronized Object getObject() {
        return object;
    }

    public void setObj(Object o) {
        /*
        static synchronized method uses class object as monitor instead of instance object
        hence we are using StaticSynchronizedExchanger.class instead of this
     */
        synchronized (StaticSynchronizedExchanger.class) {
            object = o;
        }
    }

    public Object getObj() {
        synchronized (StaticSynchronizedExchanger.class) {
            return object;
        }
    }
}
