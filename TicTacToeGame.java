package Tic_Tac_Toe;

import java.util.Arrays;

public class TicTacToeGame {
    private static final char EMPTY = ' ';
    private char[] board;

    TicTacToeGame() {
        board = new char[10];
        Arrays.fill(board,EMPTY);
    }

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
    }
}