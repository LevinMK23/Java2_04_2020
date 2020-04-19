package lesson1.homework;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Wall[] walls = new Wall[4];
        Treadmill[] treadmills = new Treadmill[4];
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            walls[i] =  new Wall(rnd.nextInt(1+5));
            treadmills[i] = new Treadmill(rnd.nextInt(1+3000));
        }
        for (int i = 0; i < 20; i++) {
            Cat cat = new Cat(rnd.nextInt(1+12000), rnd.nextInt(1+20));
            Human human = new Human(rnd.nextInt(1+12000), rnd.nextInt(1+20));
            Robot robot = new Robot(rnd.nextInt(1+12000), rnd.nextInt(1+20));
            for (int j = 0; j < 4; j++) {
                if(!cat.run(treadmills[j])){
                    break;
                }
                if(!cat.jump(walls[j])){
                    break;
                }
                if(j==3){
                    System.out.println("Кот преодолел все препятствия");
                }
            }

            for (int j = 0; j < 4; j++) {
                if(!robot.run(treadmills[j])){
                    break;
                }
                if(!robot.jump(walls[j])){
                    break;
                }
                if(j==3){
                    System.out.println("Робот преодолел все препятствия");
                }
            }

            for (int j = 0; j < 4; j++) {
                if(!human.run(treadmills[j])){
                    break;
                }
                if(!human.jump(walls[j])){
                    break;
                }
                if(j==3){
                    System.out.println("Человек преодолел все препятствия");
                }
            }

        }
    }
}
