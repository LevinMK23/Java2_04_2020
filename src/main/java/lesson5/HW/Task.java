package lesson5.HW;

public class Task {

    synchronized static void m1(int[] from, int[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    synchronized static void m2(int[] from, int[] to) {
        int len = from.length;

        Thread t1 = new Thread(() -> {
            for (int j = 0; j < len / 2; j++) {
                to[j] = from[j];
            }
        });
        Thread t2 = new Thread(() -> {
            for (int j = len / 2; j < len; j++) {
                to[j] = from[j];
            }
        });
        try {
            t1.start();
            t2.start();
            // t1.join();
            // t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] ar = new int[100000000]; // 1000000
        // 3 Ghz 3 * 10 ** 9 (6 ms)
        // Thread -> 30 ms
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 1000);
        }
        int[] copy = new int[ar.length];
        long s = System.currentTimeMillis();
        m1(ar, copy);
        long e = System.currentTimeMillis();
        System.out.println(e - s);
        s = System.currentTimeMillis();
        m2(ar, copy);
        e = System.currentTimeMillis();
        System.out.println(e - s);
    }
}
