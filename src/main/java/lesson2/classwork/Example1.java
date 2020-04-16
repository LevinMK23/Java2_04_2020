package lesson2.classwork;

public class Example1 {

    void f1() throws Exception {
        throw new Exception();
    }

    void f2() throws Exception {
        f1();
    }

    void f3() throws Exception {
        f2();
    }

    void f4() {
        f4();
    }

    void f5() {
        int a = 1 / 0;
    }

    public static void main(String[] args) {
        //new Example1().f3();
        Example1 e = new Example1();
        try {
            //e.f3();
            //e.f4(); //
           // e.f5(); //
        } catch (Throwable ex) {
            System.out.println("Catched!");
            ex.printStackTrace();
        } finally {
            System.out.println("MUST!");
        }
        System.out.println("Next string");
    }
}
