package interview_programs;

public class AltimetricProblem {

    private static  AltimetricProblem INSTANCE;

    private AltimetricProblem() {
    }

    //class level lock: no matter how many objects are created all of them will share the same monitor or lock
    //instance level lock: each instance will have its own monitor

    public static AltimetricProblem getInstance() {
        if(INSTANCE == null) {
            synchronized (AltimetricProblem.class) {
                if (INSTANCE != null) {
                    INSTANCE = new AltimetricProblem();
                }
                return INSTANCE;
            }
        } else {
            return INSTANCE;
        }
    }

}
