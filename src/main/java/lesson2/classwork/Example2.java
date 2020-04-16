package lesson2.classwork;

import java.io.BufferedReader;

public class Example2 {
    public static void main(String[] args) {
//        try {
//            throw new Exception("My esc");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e.getCause());
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
//        }
        int digit = 100;
        if (digit > 30) {
            throw new BigDigit("digit > 30");
        }
    }
}
