package lesson1.chess;

public class Rook extends Figure {

    public Rook(int posX, int posY, FigureColor color) {
        super(posX, posY, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    public boolean can(int toX, int toY) {
        if (!inBoard(toX, toY)) {
            return false;
        }
        int dx = Math.abs(toX - posX);
        int dy = Math.abs(toY - posY);
        return dx == 0 || dy == 0;
    }
}
