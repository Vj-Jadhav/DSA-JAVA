
class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    static boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int clmn = 0; clmn < 9; clmn++) {

                if (board[row][clmn] == '.') {

                    for (char d = '1'; d <= '9'; d++) {

                        if (isValid(board, row, clmn, d)) {

                            board[row][clmn] = d;

                            if (solve(board)) {
                                return true;
                            }

                           
                            board[row][clmn] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    static boolean isValid(char[][] board,
                           int row, int clmn, char num) {

        for (int i = 0; i < 9; i++) {

            
            if (board[row][i] == num ) {
                return false;
            }

            if(board[i][clmn] == num){
                return false;
            }

            
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (clmn / 3) + i % 3;

            if (board[boxRow][boxCol] == num) {
                return false;
            }
        }

        return true;
    }
}
