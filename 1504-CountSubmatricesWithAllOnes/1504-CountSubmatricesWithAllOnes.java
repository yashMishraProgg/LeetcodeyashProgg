// Last updated: 8/21/2025, 11:51:40 PM
class Solution {
    private int oneDArrayCount(int[] vec) {
        int count = 0;
        int consecutive = 0;
        for (int v : vec) {
            if (v == 1) {
                consecutive++;
                count += consecutive;
            } else {
                consecutive = 0;
            }
        }
        return count;
    }

    public int numSubmat(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int result = 0;

        for (int startRow = 0; startRow < m; startRow++) {
            int[] vec = new int[n];
            Arrays.fill(vec, 1);

            for (int endRow = startRow; endRow < m; endRow++) {
                for (int col = 0; col < n; col++) {
                    vec[col] = vec[col] & mat[endRow][col];
                }
                result += oneDArrayCount(vec);
            }
        }

        return result;
    }
}
