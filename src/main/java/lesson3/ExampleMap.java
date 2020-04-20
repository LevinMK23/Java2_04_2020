package lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExampleMap {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<String, Integer> map = new TreeMap<>();
        Scanner in = new Scanner(new File("src/main/java/lesson3/text.txt"));
        while (in.hasNext()) {
            String word = in.next();
            word = word.toLowerCase().replaceAll("[^a-z]+", "");
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        map.entrySet().stream()
                .sorted(Comparator.comparingInt(o -> -o.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
