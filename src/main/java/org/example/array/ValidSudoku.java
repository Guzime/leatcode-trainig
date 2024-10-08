package org.example.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    /**
     * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
     *
     * Each row must contain the digits 1-9 without repetition.
     * Each column must contain the digits 1-9 without repetition.
     * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     * Note:
     *
     * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
     * Only the filled cells need to be validated according to the mentioned rules.
     *
     *
     * Example 1:
     *
     *
     * Input: board =
     * [["5","3",".",".","7",".",".",".","."]
     * ,["6",".",".","1","9","5",".",".","."]
     * ,[".","9","8",".",".",".",".","6","."]
     * ,["8",".",".",".","6",".",".",".","3"]
     * ,["4",".",".","8",".","3",".",".","1"]
     * ,["7",".",".",".","2",".",".",".","6"]
     * ,[".","6",".",".",".",".","2","8","."]
     * ,[".",".",".","4","1","9",".",".","5"]
     * ,[".",".",".",".","8",".",".","7","9"]]
     * Output: true
     * Example 2:
     *
     * Input: board =
     * [["8","3",".",".","7",".",".",".","."]
     * ,["6",".",".","1","9","5",".",".","."]
     * ,[".","9","8",".",".",".",".","6","."]
     * ,["8",".",".",".","6",".",".",".","3"]
     * ,["4",".",".","8",".","3",".",".","1"]
     * ,["7",".",".",".","2",".",".",".","6"]
     * ,[".","6",".",".",".",".","2","8","."]
     * ,[".",".",".","4","1","9",".",".","5"]
     * ,[".",".",".",".","8",".",".","7","9"]]
     * Output: false
     * Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
     *
     *
     * Constraints:
     *
     * board.length == 9
     * board[i].length == 9
     * board[i][j] is a digit 1-9 or '.'.
     *
     *
     * @param board
     * @return
     */
    public boolean isValidSudoku2(char[][] board) {
        Set<Character> dublicates = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (isDublicate(board, dublicates, i, j)) return false;
            }
            dublicates.clear();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (isDublicate(board, dublicates, j, i)) return false;
            }
            dublicates.clear();
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j+= 3) {
                for (int k = i; k < i + 3; k++) {
                    for (int m = j; m < j + 3; m++) {
                        if (isDublicate(board, dublicates, k, m)) {
                            return false;
                        }
                    }
                }
                dublicates.clear();
            }
        }
        return true;
    }

    private boolean isDublicate(char[][] board, Set<Character> dublicates, int i, int j) {
        if (board[i][j] != '.') {
            if (dublicates.contains(board[i][j])) {
                return true;
            } else {
                dublicates.add(board[i][j]);
            }
        }
        return false;
    }

    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }


}
