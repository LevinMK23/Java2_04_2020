package lesson1.chess;

import javax.swing.*;

public abstract class Figure {

    protected int posX, posY;
    protected FigureColor color;
    // protected JButton place;

    public Figure(int posX, int posY, FigureColor color) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }

    protected boolean inBoard(int toX, int toY) {
        return toX >= 0 && toY >= 0 && toX < 8 && toY < 8;
    }

    public void move(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public abstract boolean can(int toX, int toY);
}
