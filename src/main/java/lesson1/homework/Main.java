package lesson1.homework;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Wall [] walls = new Wall[5];
        Treadmill [] treadmills = new Treadmill[5];
        Obstacle [] obstacles = new Obstacle[10];
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            walls[i] = new Wall(rnd.nextInt(1 + 10));
            treadmills[i] = new Treadmill(rnd.nextInt(1 + 1000));
            obstacles[i] = walls[i];
            obstacles[5 + i] = treadmills[i];
        }
        for (int i = 0; i < 15; i++) {
            Cat cat = new Cat(rnd.nextInt(1 + 10), rnd.nextInt(1 + 1000));
            Human human = new Human(rnd.nextInt(1 + 10), rnd.nextInt(1 + 1000));
            Robot robot = new Robot(rnd.nextInt(1 + 10), rnd.nextInt(1 + 1000));
            for (int j = 0; j < 10; j++) {
                //obstacles[j].take(cat);
            }
        }
    }
}
