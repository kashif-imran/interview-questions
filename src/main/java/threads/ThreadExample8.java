package threads;

/*
Race condition and invisible writes
 */
public class ThreadExample8 {

    public static class MyRunnable implements Runnable {
        private  int count=0;

        @Override
        public void run() {
            for(int i=0; i< 1000000; i++) {
                this.count++;
            }
            System.out.println(Thread.currentThread().getName() + " : " + this.count);
        }
    }

    public static class SynchronizedRunnable implements Runnable {
        private  int count=0;

        @Override
        public void run() {
            for(int i=0; i< 1000000; i++) {
                synchronized (this) {
                    this.count++;
                }
            }
            System.out.println(Thread.currentThread().getName() + " : " + this.count);
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable();
        MyRunnable runnable2 = new MyRunnable();

        Thread t1 = new Thread(runnable1, "Thread 1");
        Thread t2 = new Thread(runnable2, "Thread 2");

        t1.start();
        t2.start();
        /*
        Prints
        Thread 1 : 1000000
        Thread 2 : 1000000*
        As both the threads share the same runnable
        */

        ThreadUtils.sleep(5000);
        System.out.println("----------------------");

        MyRunnable runnable3 = new MyRunnable();
        Thread t3 = new Thread(runnable3, "Thread 3");
        Thread t4 = new Thread(runnable3, "Thread 4");
        t3.start();
        t4.start();
        /*
        Thread 4 : 1842222
        Thread 3 : 1916500

       As both threads are sharing runnable3 we are getting unequal values due to race conditions and invisible writes
        */
        ThreadUtils.sleep(5000);
        System.out.println("----------------------");

        SynchronizedRunnable runnable4 = new SynchronizedRunnable();
        Thread t5 = new Thread(runnable4, "Thread 5");
        Thread t6 = new Thread(runnable4, "Thread 6");
        t5.start();
        t6.start();


    }









}
