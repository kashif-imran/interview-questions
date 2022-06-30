package synechron;

public class Example2 {

    public static void main(String[] args) {

        C a1 = new C();


    }
}

class C {

    int print(int x) {
        System.out.println("Overloaded method print");
        return 1;
    }

    /*Integer print(int x) { // both methods have same erasure
        return 1;
    }*/
}