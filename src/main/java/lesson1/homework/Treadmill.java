package lesson1.homework;

public class Treadmill implements Obstacle {

    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void take(Runnable runnable) {
        runnable.run(length);
    }

    @Override
    public void take(Jumpable runnable) {

    }
}
