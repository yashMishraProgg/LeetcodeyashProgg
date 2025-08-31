class Solution {
    //to check value , row and box  validity
    private boolean isValid(char[][] board, int row, int col, char d) {
        for (int i = 0; i < 9; i++) {

            //check col validity -> col will fixed 
            if (board[i][col] == d) {
                return false;
            }
            //check row validity -> row will fixed
            if (board[row][i] == d) {
                return false;
            }

            //check box validity - > use k to iterate row and l to col
            //determine start i(row) , start col(j) -> as i/3 and j/3 rule 
            int start_i = row / 3 * 3;
            int start_j = col / 3 * 3;

            for (int k = 0; k < 3; k++) {//as box is 3*3
                for (int l = 0; l < 3; l++) {
                    if (board[start_i + k][start_j + l] == d) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean solve(char[][] board) {
        //3 steps
        //iterate over
        //if valid => add , if not => start over again
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                //check empty
                if (board[i][j] == '.') { 
                    //can add characters

                    for (char d = '1'; d <= '9'; d++) {

                        if (isValid(board, i, j, d)) {
                            board[i][j] = d;

                            if (solve(board) == true) {
                                return true;
                            }

                            //if false then undo
                            board[i][j] = '.';  
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}
