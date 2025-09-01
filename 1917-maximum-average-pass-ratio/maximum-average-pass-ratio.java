class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // Max heap: {delta, index}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double deltaA = gain(classes[a[0]][0], classes[a[0]][1]);
            double deltaB = gain(classes[b[0]][0], classes[b[0]][1]);
            return Double.compare(deltaB, deltaA); // max-heap
        });

        int n = classes.length;

 
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{i});
        }

        // Assign extra students
        while (extraStudents-- > 0) {
            int[] curr = pq.poll();
            int idx = curr[0];

            // Update  class
            classes[idx][0]++; // passing students
            classes[idx][1]++; // total students

         
            pq.offer(new int[]{idx});
        }

        double total = 0.0;
        for (int i = 0; i < n; i++) {
            total += (double) classes[i][0] / classes[i][1];
        }

        return total / n;
    }

    // Gain if we add one student to this class
    private double gain(int pass, int total) {
        double current = (double) pass / total;
        double next = (double) (pass + 1) / (total + 1);
        return next - current;
    }
}
