import java.util.Arrays;

class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        Job[] jobs = new Job[n];
        
        // Create jobs array with start time, end time, and profit
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        
        // Sort jobs by end time
        Arrays.sort(jobs, (a, b) -> a.endTime - b.endTime);
        
        int[] dp = new int[n];
        dp[0] = jobs[0].profit;
        
        for (int i = 1; i < n; i++) {
            int inclProfit = jobs[i].profit;
            int lastNonConflict = binarySearch(jobs, i);
            if (lastNonConflict != -1) {
                inclProfit += dp[lastNonConflict];
            }
            dp[i] = Math.max(inclProfit, dp[i - 1]);
        }
        
        return dp[n - 1];
    }
    
    private int binarySearch(Job[] jobs, int index) {
        int low = 0, high = index - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (jobs[mid].endTime <= jobs[index].startTime) {
                if (jobs[mid + 1].endTime <= jobs[index].startTime) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    class Job {
        int startTime, endTime, profit;
        
        Job(int startTime, int endTime, int profit) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }
    }
}