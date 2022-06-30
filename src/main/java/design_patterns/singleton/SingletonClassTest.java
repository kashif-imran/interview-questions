package design_patterns.singleton;

import java.lang.reflect.Constructor;

public class SingletonClassTest {
    public static void main(String[] args) throws Exception {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Constructor<SingletonClass>[] consts = (Constructor<SingletonClass>[]) SingletonClass.class.getDeclaredConstructors();
        for(Constructor<SingletonClass> constr: consts) {
            constr.setAccessible(true); // we can get constructors using getDeclaredConstructors() and set private constructor as public;
            s2 = constr.newInstance();
        }

        System.out.println(s2.hashCode());
    }

}
