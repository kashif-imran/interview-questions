package synechron;

public class Singleton {

    private volatile static  Singleton INSTANCE; // it should be static/class variable else we will get stackoverflow exception

    private Singleton() {
        if(INSTANCE != null) { // to prevent breaking singleton using reflection. constructor.setAccess
            throw new RuntimeException("Method not allowed exception");
        }
    }

    //class level lock: no matter how many objects are created all of them will share the same monitor or lock
    //instance level lock: each instance will have its own monitor

    public static Singleton getInstance() {
        if(INSTANCE == null) { // performance
            synchronized (Singleton.class) { // class level lock
                if (INSTANCE == null) { // So that another thread does'nt create a duplicate singleton instance
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    protected Object readResolve() { // to prevent breaking singleton using deserialization
        return INSTANCE;
    }

}

/*
Sync block is like OT in a hospital



 */