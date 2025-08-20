// Last updated: 8/20/2025, 10:34:57 PM
class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int result = 0;

        // dp[i][j] will store max size of square submatrix ending at (i,j)
        int[][] dp = new int[m][n];

        // Traverse the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1; // first row/col can only form 1x1 square
                    } else {
                        dp[i][j] = 1 + Math.min(dp[i - 1][j], 
                                        Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                    }
                    result += dp[i][j]; // add all squares ending at (i,j)
                }
            }
        }

        return result;
    }
}
