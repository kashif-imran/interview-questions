package synechron;

import java.util.ArrayList;
import java.util.List;

//read about overflow and underflow
public abstract class Example {
    Example() {
        System.out.println("constructor called");
    }

    public static void main(String[] args) { // new object of Example will not be created when running main method
        System.out.println("Hello world!");

        synechron.overriding_puzzle.A a1 = new synechron.overriding_puzzle.B();
        //a1.print(1); a1 has no reference to new methods of B which are not present in A

        List list = new ArrayList<>(); // methods which are available to only list
        //we use the above way as we can replace the imlementation with any other implementation of List


    }
}

class A {
    static void print() {
        System.out.println("From A"); //method hiding it depends on reference variable
    }

    void print(int x) throws  Exception{ // propogation of exceptions
        System.out.println("Overloaded method print");
    }

    Number print(int x, int y) {
        return 1;

    }
}

class B extends synechron.overriding_puzzle.A {
    /*
    void print() {  // instance method cannot override static method
        System.out.println("From B");
    }*/

    static void print() {
        System.out.println("From B");
    }

    void print(int x) {
        System.out.println("Overloaded method print");
    }

    Integer print(int x, int y) { // return types should be same or covariants(subclasses)
        return 1;
    }
}