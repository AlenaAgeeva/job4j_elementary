package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            int count = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 'X') {
                    result = false;
                    break;
                } else {
                    count++;
                }
            }
            if (count == board[i].length) {
                result = true;
                break;
            }
        }
        return result;
    }
}
