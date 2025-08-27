class Solution {
    int[][] directions = {{1,1}, {1,-1}, {-1,-1}, {-1,1}};
    int m, n;

    private int solve(int i, int j, int d, boolean canTurn, int val, int[][] grid) {
        int i_ = i + directions[d][0];
        int j_ = j + directions[d][1];

        if (i_ < 0 || i_ >= m || j_ < 0 || j_ >= n || grid[i_][j_] != val) {
            return 0;
        }

        int result = 0;
        int keepMoving = 1 + solve(i_, j_, d, canTurn, (val == 2 ? 0 : 2), grid);
        result = Math.max(result, keepMoving);

        if (canTurn == true) {
            int turnAndMove = Math.max(keepMoving,
                1 + solve(i_, j_, (d+1)%4, false, (val == 2 ? 0 : 2), grid));
            result = Math.max(result, turnAndMove);
        }

        return result;
    }

    public int lenOfVDiagonal(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    for (int d = 0; d < 4; d++) {
                        result = Math.max(result,
                            1 + solve(i, j, d, true, 2, grid));
                    }
                }
            }
        }
        return result;
    }
}
