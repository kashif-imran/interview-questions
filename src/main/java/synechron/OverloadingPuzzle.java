package synechron;

/*
The reason is that in case of method overloading,when a parameter is passed that can be referenced by both child and parent class,
 the method with the parameter of type child class will always be called.

The String is a subclass of Object and therefore its method is called.

How ever if we have

static void methoda(Integer o) {
    System.out.println("Object");
}

static void  methoda(String s) {
    System.out.println("String");
}

Then it will throw compile time exception Ambigous method call in both methods as both are in same heirarchy

 */
public class OverloadingPuzzle {
    static void methoda(Object o) {
        System.out.println("Object");
    }

    static void  methoda(String s) {
        System.out.println("String");
    }

    public static void main(String []args) {
        methoda(null);
    }
}
