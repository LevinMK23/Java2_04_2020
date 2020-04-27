package lesson5;

import java.util.Random;

public class Example1 {

    static void print(char ch) {
        while (true) {
            System.out.print(ch);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void sort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] ar = new int[70000];
        Random rnd = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = rnd.nextInt(70000);
        }
        new Thread(() -> {
            System.out.println("---sort started---");
            sort(ar);
            System.out.println("---sort finished---");
        }).start();
        new Thread(() -> print('[')).start();
        new Thread(() -> print(']')).start();
    }
}
