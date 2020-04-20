package lesson3;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //CustomList<Integer> cl = new CustomList<>();
        for (int i = 0; i < 15; i++) {
            //cl.add(i + 1);
            list.add(i + 1);
        }
        list.add(3, 50);
        list.remove(6);
        list.remove(12);
        System.out.println(list.subList(4, 8));
        System.out.println(list.indexOf(90));
        System.out.println(list);

    }
}
