package pack;

public class A {

    public A(int a) {
        this.a = a;
        System.out.println("A " + this);
    }

    protected int a;
    private int b;

    // alt + insert
    int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
