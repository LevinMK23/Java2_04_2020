package lesson1.homework;

public class Cat implements Runnable, Jumpable {
    int runLim;
    int jumpLim;

    public Cat(int runLim, int jumpLim) {
        this.runLim = runLim;
        this.jumpLim = jumpLim;
    }

    @Override
    public boolean jump(Wall wall) {
        jumpLim-=wall.height;
        if(runLim<0){
            System.out.println("Кот не преодолел полосу препятствий");
            return(false);
        }
        return(true);
    }

    @Override
    public boolean run(Treadmill treadmill) {
        runLim-=treadmill.length;
        if(runLim<0){
            System.out.println("Кот не преодолел полосу препятствий");
            return(false);
        }
        return(true);
    }
}
