class Solution {

    // Helper: minimum bounding rectangle covering all 1s in subgrid
    private int minimumArea(int startRow, int endRow, int startCol, int endCol, int[][] grid) {
        int minRow = endRow, maxRow = startRow - 1;
        int minCol = endCol, maxCol = startCol - 1;

        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        if (maxRow < minRow || maxCol < minCol) {
            return 0; // no 1s
        }
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }

    // Core partition logic (3 rectangles)
    private int utility(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = Integer.MAX_VALUE;

        // Case A: top + bottomLeft + bottomRight
        for (int rowSplit = 1; rowSplit < m; rowSplit++) {
            for (int colSplit = 1; colSplit < n; colSplit++) {
                int top = minimumArea(0, rowSplit, 0, n, grid);
                int bottomLeft = minimumArea(rowSplit, m, 0, colSplit, grid);
                int bottomRight = minimumArea(rowSplit, m, colSplit, n, grid);

                result = Math.min(result, top + bottomLeft + bottomRight);

                // Case B: topLeft + topRight + bottom
                int topLeft = minimumArea(0, rowSplit, 0, colSplit, grid);
                int topRight = minimumArea(0, rowSplit, colSplit, n, grid);
                int bottom = minimumArea(rowSplit, m, 0, n, grid);

                result = Math.min(result, topLeft + topRight + bottom);
            }
        }

        // Case C: horizontal 3 splits (top + middle + bottom)
        for (int split1 = 1; split1 < m; split1++) {
            for (int split2 = split1 + 1; split2 < m; split2++) {
                int top = minimumArea(0, split1, 0, n, grid);
                int middle = minimumArea(split1, split2, 0, n, grid);
                int bottom = minimumArea(split2, m, 0, n, grid);

                result = Math.min(result, top + middle + bottom);
            }
        }

        return result;
    }

    // Rotate grid 90° clockwise
    private int[][] rotateGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] rotated = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][m - 1 - i] = grid[i][j];
            }
        }
        return rotated;
    }

    // Main LeetCode function
    public int minimumSum(int[][] grid) {
        int ans = Integer.MAX_VALUE;
        int[][] current = grid;

        for (int r = 0; r < 4; r++) { // rotate 4 times
            ans = Math.min(ans, utility(current));
            current = rotateGrid(current);
        }
        return ans;
    }
}
