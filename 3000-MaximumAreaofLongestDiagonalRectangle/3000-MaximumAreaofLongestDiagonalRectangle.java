// Last updated: 8/26/2025, 2:53:57 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = -1;
        int maxArea = -1;

        for (int[] recta : dimensions) {
            int length = recta[0];
            int width = recta[1];

    double diagonal = Math.sqrt((long) length * length + (long) width * width);
            int area = length * width;

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
