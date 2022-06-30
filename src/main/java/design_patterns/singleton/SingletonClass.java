package design_patterns.singleton;

import java.io.Serializable;

public class SingletonClass implements Serializable {

    //private static SingletonClass INSTANCE = new SingletonClass(); // Eager instantiation, same if it is done in SIB

    private static SingletonClass INSTANCE;

    private SingletonClass() throws Exception {
        if(INSTANCE != null) {
            /*
            To resolve:
            Constructor<SingletonClass>[] consts = (Constructor<SingletonClass>[]) SingletonClass.class.getDeclaredConstructors();
        for(Constructor<SingletonClass> constr: consts) {
            constr.setAccessible(true); // we can get constructors using getDeclaredConstructors() and set private constructor as public;
            s2 = constr.newInstance();
        }
             */
            throw new Exception("Not Allowed");
        }

    }

    public static SingletonClass getInstance() throws Exception {
        if(INSTANCE == null) {
            synchronized (SingletonClass.class) {
                if(INSTANCE == null) {
                    INSTANCE = new SingletonClass(); // Lazy Instantiation
                }
            }
        }
        return INSTANCE;
    }

    private Object readResolve() throws Exception { // to resolve deserialization issue
        return  getInstance();
    }
}
