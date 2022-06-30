package threads;
/*
1. There is a java thread method stop() which is depricated, we must never call it as we dont know where it will stop
2. Thread termination is not so straight forward. A running thread, often called by many writers as a light-weight process,
   has its own stack and is the master of its own destiny (well daemons are). It may own files and sockets. It may hold locks.
   Abrupt Termination is not always easy: Unpredictable consequences may arise if the thread is in the middle of writing to a file
    and is killed before it can finish writing. Or what about the monitor locks held by the thread when it is shot in the head?

   Instead, Threads rely on a cooperative mechanism called Interruption. This means that Threads could only signal other threads to stop,
   not force them to stop.

   To stop threads in Java, we rely on a co-operative mechanism called Interruption. The concept is very simple. To stop a thread,
   all we can do is deliver it a signal, aka interrupt it, requesting that the thread stops itself at the next available opportunity.
    That’s all. There is no telling what the receiver thread might do with the signal: it may not even bother to check the signal; or
     even worse ignore it.

   This is the reason  it is better to implement stop yourself
*/
public class ThreadExample4 {

    public static class StoppableRunnable implements Runnable {


        private boolean stopRequested = false;

        public synchronized void requestStop() {
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }

        private void sleep(long milis) {
            try {
                Thread.sleep(milis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            System.out.println("StoppableRunnable Running");
            while (!isStopRequested()) {
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("StoppableRunnable Stopped");
        }
    }


    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread t1 = new Thread(stoppableRunnable, "Thread");
        t1.start();

        try {
            Thread.sleep(5000); // main thread sleep for 5 secs
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Requesting stop");
        stoppableRunnable.requestStop();
        System.out.println("stop requested");

    }
}
