// Last updated: 12/6/2025, 10:59:07 PM
1class Solution {
2    public int[] countBits(int n) {
3
4        // Create an array of size n+1 to store the number of 1s for each number from 0 to n
5        int ans[] = new int[n+1];
6
7        // Start from 1 because ans[0] is already 0 (binary of 0 has zero 1s)
8        for(int i = 1; i <= n; i++) {
9
10            /*
11             * ans[i / 2] = number of 1s in the binary representation of i after removing last bit
12             * (i % 2) = last bit (1 if odd, 0 if even)
13             * So total 1s in i = total 1s in (i/2) + last bit
14             */
15            ans[i] = ans[i / 2] + (i % 2);
16        }
17
18        // Return the result array
19        return ans;
20    }
21}
22