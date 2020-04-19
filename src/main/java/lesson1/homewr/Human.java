package lesson1.homework;

public class Human implements Runnable, Jumpable {
    int jumpLim;
    int runLim;

    public Human(int runLim,int jumpLim) {
        this.jumpLim = jumpLim;
        this.runLim = runLim;
    }

    @Override
    public boolean jump(Wall wall) {
        jumpLim -= wall.height;
        if(runLim<0){
            System.out.println("Человек не преодолел полосу препятствий");
            return(false);
        }
        return(true);
    }

    @Override
    public boolean run(Treadmill treadmill) {
        runLim -= treadmill.length;
        if(runLim<0){
            System.out.println("Человек не преодолел полосу препятствий");
            return(false);
        }
        return(true);
    }
    // TODO: 4/15/2020  need implements Runnable, Jumpable
}
