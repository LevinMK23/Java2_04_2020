package lesson1.chess;

public class ChessBoard {

    private Figure [][] board;

    public ChessBoard() {
        board = new Figure[8][8];
        board[0][1] = new Knight(0, 1, FigureColor.BLACK);
        board[0][0] = new Rook(0,0, FigureColor.BLACK);
        board[7][1] = new Knight(0, 1, FigureColor.WHITE);
        board[7][0] = new Rook(0,0, FigureColor.WHITE);
        board[0][6] = new Knight(0, 1, FigureColor.BLACK);
        board[0][7] = new Rook(0,0, FigureColor.BLACK);
        board[7][6] = new Knight(0, 1, FigureColor.WHITE);
        board[7][7] = new Rook(0,0, FigureColor.WHITE);
    }

    private String strValue(Figure figure) {
        return figure == null ? "_" : figure.toString();
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(strValue(board[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public void move(int fromX, int fromY, int toX, int toY) {
        if (board[fromX][fromY].can(toX, toY)) {
            Figure tmp = board[fromX][fromY];
            board[fromX][fromY] = null;
            board[toX][toY] = tmp;
            tmp.move(toX, toY);
        } else {
            System.out.println("Ход не возможен!");
        }
    }
}
