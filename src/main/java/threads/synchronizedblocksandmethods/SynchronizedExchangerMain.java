package threads.synchronizedblocksandmethods;

public class SynchronizedExchangerMain {
    public static void main(String[] args) {
        SynchronizedExchanger exchanger = new SynchronizedExchanger();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++) {
                    exchanger.setObject("" + i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++) {
                    System.out.println(exchanger.getObject());
                }
            }
        });

        t1.start();
        t2.start();
    }
}
