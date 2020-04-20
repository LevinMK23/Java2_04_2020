package lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Telephone {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<String, User> map = new TreeMap<>();
        Scanner in = new Scanner(new File("src/main/java/lesson3/user.txt"));
        while (in.hasNext()) {
            String name = in.next();
            String id = in.next();
            String number = in.next();
            if (!map.containsKey(id)) {
                map.put(id, new User(name, id));
            }
            map.get(id).addNumber(number);
        }
        map.forEach((key, value) -> System.out.println(value.getName() + " id:" +
                value.getId() + " " + value.getNumbers()));
    }
}
