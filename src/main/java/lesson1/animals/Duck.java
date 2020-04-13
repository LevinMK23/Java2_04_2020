package lesson1.animals;

public class Duck extends Bird implements Swimmable {
    @Override
    public String getType() {
        return "Duck";
    }

    public void swim() {
        System.out.println(getType() + " swim");
    }
}
