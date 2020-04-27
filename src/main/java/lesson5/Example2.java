package lesson5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        System.out.println(runnable.getClass());
        runnable.run();
        // lambda
        Runnable runnable1 = () -> System.out.println("Hello lambda");
        System.out.println(runnable1.getClass());
        runnable1.run();
        ActionListener listener = (action) -> {
            System.out.println(action.paramString());
        };


    }
}
