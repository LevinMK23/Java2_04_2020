package lesson5;

public class TicTac {

    public synchronized void lol() {

    }

    public static void main(String[] args) {
        // mutex - общий инстанс для всех потоков синхронизации
        Object mutex = new Object();

        new Thread(()->{
            while (true) {
                synchronized (mutex) {
                    System.out.println("TIC");
                    try {
                        Thread.sleep(300);
                        mutex.notify();
                        mutex.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
        new Thread(()->{
            while (true) {
                synchronized (mutex) {
                    System.out.println("TAC");
                    try {
                        Thread.sleep(300);
                        mutex.notify();
                        mutex.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
