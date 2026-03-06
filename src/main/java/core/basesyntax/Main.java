package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();

        MyThread daemonThread = new MyThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
    }

    static class MyThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("I am the daemon thread!");
            }
        }
    }

    static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);
            }
        }
    }
}
