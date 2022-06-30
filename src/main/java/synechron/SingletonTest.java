package synechron;

import interview_programs.AltimetricProblem;

public class SingletonTest {

    public static void main(String[] args) {

        AltimetricProblem instance1 = AltimetricProblem.getInstance();
        AltimetricProblem instance2 = AltimetricProblem.getInstance();

        System.out.println(instance1 == instance2);


    }
}
