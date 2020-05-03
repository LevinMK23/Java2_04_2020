package lesson5.homework;

import java.util.Random;

public class Main {
    public static void calc1(){
        int size = 10000000;
        int h = size / 2;
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Первый метод="+(System.currentTimeMillis()-a));
    }
    static void calc2(){
        int size = 10000000;
        int h = size / 2;
        float[] arr = new float[size];
        for (int i = 0; i < 100000; i++) {
            arr[i] = 1f;
        }
        new Thread(() -> {

            for (int i = 0; i < h; i++) {
                arr[i] = 1f;
            }
            long a = System.currentTimeMillis();
            for (int i = 0; i < h; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

            System.out.println("Первый поток="+(System.currentTimeMillis()-a));

        }).start();
        new Thread(() -> {

            for (int i = h; i < size; i++) {
                arr[i] = 1f;
            }
            long a = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }

            System.out.println("Второой поток="+(System.currentTimeMillis()-a));
        }).start();

    }
    public static void main(String[] args) {
    calc1();
    calc2();
    }

}
