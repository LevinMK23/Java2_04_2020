package lesson1.chess;

public class Knight extends Figure {


    public Knight(int posX, int posY, FigureColor color) {
        super(posX, posY, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    public boolean can(int toX, int toY) {
        if (!inBoard(toX, toY)) {
            return false;
        }
        int dx = Math.abs(toX - posX);
        int dy = Math.abs(toY - posY);
        return dx * dx + dy * dy == 5;
    }
}
