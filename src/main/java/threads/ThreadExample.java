package threads;

//Demonstrates 4 ways to create a thread
public class ThreadExample {

    public static class MyThread extends  Thread {
        @Override
        public void run() {
            System.out.println("My Thread is running");
            System.out.println("My Thread is finished");
        }
    }

    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("My Runnable is running");
            System.out.println("My Runnable is finished");
        }
    }


    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        System.out.println();

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        Thread anonymousRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("My AnonymousRunnable is running");
                System.out.println("My AnonymousRunnable is finished");
            }
        });
        anonymousRunnable.start();

        Runnable lamdaRunnable = () -> {
            System.out.println("My LamdaRunnable is running");
            System.out.println("My LamdaRunnable is finished");
        };
        Thread lamdaThread = new Thread(lamdaRunnable);
        lamdaThread.start();
    }
}
