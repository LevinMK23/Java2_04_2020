package lesson5;

public class CustomThread extends Thread {

    @Override
    public void run() {
        while (running) {
            System.out.print("*");
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread finished correctly");
    }

    private volatile boolean running;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public CustomThread() {
        running = true;
    }
}
