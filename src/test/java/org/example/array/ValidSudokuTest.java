package org.example.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuTest {

    @Test
    public void test1() {
        ValidSudoku array10Task = new ValidSudoku();
        char[][] inputArray ={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','.'},
                {'.','.','.','.','8','.','.','7','9'},
        };
        boolean validSudoku = array10Task.isValidSudoku(inputArray);
        assertTrue(validSudoku);
    }

}