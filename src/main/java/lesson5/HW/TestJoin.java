package lesson5.HW;

public class TestJoin {
    static void foo() throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.print("(");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.print(")");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        // эта строка не начнется пока не завершится поток 1
        System.out.println("1");
    }

    public static void main(String[] args) throws InterruptedException {
        foo();
    }
}
