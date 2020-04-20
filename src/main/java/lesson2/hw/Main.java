package lesson2.hw;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: 14.04.2020
        Object[][] arr = new Object[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i] = new Object[]{7, 3, "ty", 1.33};
        }
        System.out.println(arraySum(arr));
    }
    public static int arraySum(Object [][] array) {
        // TODO: 14.04.2020
        int sum = 0;
        try {
            if (array[1].length > 4 || array.length > 4) {
                throw new ArraySizeException();
            }
        }
        catch (ArrayDataException e){
            System.out.println("Неверный размер матрицы");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += ((int) array[i][j]);
                }
                catch(ClassCastException e){
                    System.out.println("Неверный тип данных в ячейке массива под индексом ["+i+"]["+j+"]");
                }
            }
        }

        return sum;
    }


}
