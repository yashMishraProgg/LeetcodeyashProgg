// Last updated: 9/3/2025, 11:28:55 PM
class Solution {
    public int numberOfPairs(int[][] points) {
        //x-asc , y = desc
        Arrays.sort(points, Comparator
                .comparingInt((int[] p) -> p[0])
                .thenComparingInt(p -> -p[1]));

        int n = points.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int yi = points[i][1];
            int maxY = Integer.MIN_VALUE;

            for (int j = i + 1; j < n; j++) {
                int yj = points[j][1];
                // Bob must be not higher than Alice
                if (yj <= yi && yj > maxY) {
                    ans++;
                    maxY = yj;
                }
            }
        }
        return ans;
    }
}
