// Last updated: 8/17/2025, 10:27:54 PM
class Solution {
    public double new21Game(int n, int k, int maxPts) {
        // if totalscore <= n alice win
        // if score = k alice stops drawing
        // if k = 0 alice never draws
        // if n is >= even the maxscore <= n always win

        if (k == 0 || n >= k + maxPts - 1) {
            return 1.0; // prob win
        }

        double[] pei = new double[n + 1]; // dp array
        pei[0] = 1;

        double windSum = 1.0; // sliding window sum taken as 1
        double result = 0.0;  // final score

        for (int i = 1; i <= n; i++) {

            pei[i] = windSum / maxPts; // pei[3] = (pei[1]+pei[2])/max basically finding prob
            if (i < k) {
                windSum += pei[i]; // keep drawing
            } else {
                // stop
                result += pei[i];
            }

            if (i - maxPts >= 0) { // slide window
                windSum = windSum - pei[i - maxPts]; // remove old prob
            }
        }
        return result;
    }
}
