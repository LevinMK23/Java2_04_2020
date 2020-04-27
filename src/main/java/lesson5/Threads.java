package lesson5;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread();
//        CustomThread t1 = new CustomThread();
//        t1.start();
//        Thread.sleep(2000);
//        t1.setRunning(false);
        for (int i = 0; i < 10; i++) {
            new Thread(new CustomRunnable()).start();
        }
        while (true) {
            System.out.println(CustomRunnable.getCounter());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
