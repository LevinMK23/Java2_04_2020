package lesson1.chess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        board.printBoard();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите Х Y X1 Y1");
            int x = in.nextInt(), y = in.nextInt();
            int x1 = in.nextInt(), y1 = in.nextInt();
            x--; x1--;
            y--; y1--;
            board.move(x, y, x1, y1);
            board.printBoard();
        }
    }
}
