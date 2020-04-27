package lesson5;

public class CustomRunnable implements Runnable {
    private volatile static int counter = 0;
    private volatile boolean running;

    public CustomRunnable() {
        running = true;
        //counter = 0;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        while (running) {
            counter++;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
