package lesson1.animals;

public class River {
    void swim(Swimmable swimmable) {
        swimmable.swim();
    }

    public static void main(String[] args) {
        River river = new River();
        river.swim(new Duck());
        river.swim(new Pelican());
        Swimmable swimmable = new Duck();
    }
}
