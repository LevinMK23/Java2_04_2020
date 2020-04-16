package lesson1.homework;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void take(Runnable runnable) {

    }

    public void take(Jumpable jumpable) {
        jumpable.jump(height);
    }
}
