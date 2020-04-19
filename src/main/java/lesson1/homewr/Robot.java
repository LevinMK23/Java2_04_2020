package lesson1.homework;

public class Robot implements Runnable, Jumpable {
    int jumpLim;
    int runLim;

    public Robot(int runLim,int jumpLim) {
        this.jumpLim = jumpLim;
        this.runLim = runLim;
    }

    @Override
    public boolean jump(Wall wall) {
        jumpLim-=wall.height;
        if(jumpLim<0){
            System.out.println("Робот не преодолел полосу препятствий");
            return(false);
        }
        return(true);
    }

    @Override
    public boolean run(Treadmill treadmill) {
        runLim-=treadmill.length;
        if(runLim<0){
            System.out.println("Робот не преодолел полосу препятствий");
            return(false);
        }
        return(true);
    }

}
