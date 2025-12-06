class Solution {
    public int[] countBits(int n) {

        // Create an array of size n+1 to store the number of 1s for each number from 0 to n
        int ans[] = new int[n+1];

        // Start from 1 because ans[0] is already 0 (binary of 0 has zero 1s)
        for(int i = 1; i <= n; i++) {

            /*
             * ans[i / 2] = number of 1s in the binary representation of i after removing last bit
             * (i % 2) = last bit (1 if odd, 0 if even)
             * So total 1s in i = total 1s in (i/2) + last bit
             */
            ans[i] = ans[i / 2] + (i % 2);
        }

        // Return the result array
        return ans;
    }
}
