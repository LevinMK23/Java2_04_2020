import pack.A;

//
public class B extends A {

    public B(int a) {
        super(a);
        System.out.println("B " + this);
    }

    void met() {
        this.setA(1);
    }
}
