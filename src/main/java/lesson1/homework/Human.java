package lesson1.homework;

public class Human implements Runnable, Jumpable {
    private int runLimit, jumpLimit;

    public Human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void jump(int limit) {
        if (limit < jumpLimit) {
            jumpLimit -= limit;
            System.out.println("Cat jump to " + limit + " m");
            System.out.println("Now jumpLimit = " + jumpLimit);
        } else {
            System.out.println("Cat cannot jump to " + limit + " m");
        }
    }

    @Override
    public void run(int limit) {
        if (limit < runLimit) {
            runLimit -= limit;
            System.out.println("Cat jump to " + limit + " m");
            System.out.println("Now runLimit = " + runLimit);
        } else {
            System.out.println("Cat cannot run to " + limit + " m");
        }
    }
}
