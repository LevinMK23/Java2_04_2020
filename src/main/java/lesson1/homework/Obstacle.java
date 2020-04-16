package lesson1.homework;

public interface Obstacle {
    void take(Runnable runnable);
    void take(Jumpable runnable);
}
