import pack.A;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        A b = new B(1);
        A a = new A(1);
        System.out.println(a instanceof A);
        System.out.println(b instanceof A);
        System.out.println(a);
        b = b;
        System.out.println(b.getClass());
    }
}
