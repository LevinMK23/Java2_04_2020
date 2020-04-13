package lesson1.animals;

public class Pelican extends Bird implements Swimmable {
    @Override
    public String getType() {
        return "Pelican";
    }

    public void swim() {
        System.out.println(getType() + " swim");
    }
}
