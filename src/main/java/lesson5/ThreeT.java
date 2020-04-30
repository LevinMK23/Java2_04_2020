package lesson5;

import javax.sound.midi.Track;

public class ThreeT {
    public static void main(String[] args) {
        Object mon = new Object(); // common object for all threads
        new Thread(() -> {
            while (true) {
                synchronized (mon) {
                    System.out.print("1");
                    try {
                        mon.notify();
                        Thread.sleep(200);
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                synchronized (mon) {

                    System.out.print("2");
                    try {
                        mon.notify();
                        Thread.sleep(200);
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                synchronized (mon) {
                    System.out.print("3");
                    try {
                        mon.notify();
                        Thread.sleep(200);
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
