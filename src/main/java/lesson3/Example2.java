package lesson3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        Random rnd = new Random();
        // HashSet<String> set2 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set1.add(1);
            // set2.add("iiiii" + (i + 1));
        }
        set1.add(7);
        set1.add(97);
        System.out.println(set1);
        System.out.println(set1.subSet(25, 57));
        // O(logN)
        System.out.println(set1.floor(18));
        System.out.println(set1.higher(73));
        System.out.println(set1.descendingSet());
    }
}
