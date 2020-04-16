package lesson1.homework.v2;

public class Cat {

    int stamina;

    public Cat(int stamina) {
        this.stamina = stamina;
    }

    public void take(Obstacle obstacle) {
        int limit = obstacle.take(15);
        if (limit < stamina) {

        }
    }
}
