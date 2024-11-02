import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudokuRow(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> checkRow = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (checkRow.contains(board[i][j])) {
                        return false;
                    }
                    checkRow.add(board[i][j]);
                }
            }
        }
        return true;
    }

    // Kiểm tra các cột
    public boolean isValidSudokuColumn(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> checkColumn = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (checkColumn.contains(board[j][i])) {
                        return false;
                    }
                    checkColumn.add(board[j][i]);
                }
            }
        }
        return true;
    }


    public boolean isValidSudokuBox(char[][] board) {
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Character> checkBox = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char num = board[row + i][col + j];
                        if (num != '.') {
                            if (checkBox.contains(num)) {
                                return false;
                            }
                            checkBox.add(num);
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        return isValidSudokuRow(board) && isValidSudokuColumn(board) && isValidSudokuBox(board);
    }

    public static void main(String[] args) {
        ValidSudoku validator = new ValidSudoku();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Is the Sudoku board valid? " + validator.isValidSudoku(board));
    }
}

