package lesson3;

import java.util.ArrayList;

public class User {

    private String name, id;
    private ArrayList<String> numbers;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
        numbers = new ArrayList<>();
    }

    public void addNumber(String number) {
        numbers.add(number);
    }

    public ArrayList<String> getNumbers() {
        return numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
