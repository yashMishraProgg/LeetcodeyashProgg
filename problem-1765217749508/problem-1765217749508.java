// Last updated: 12/8/2025, 11:45:49 PM
1class Solution {
2    public int countTriples(int n) {
3
4        // Keeping track of the number of valid Pythagorean triples
5        int count = 0;
6
7        // Looping through all values of 'a' from 1 to n
8        for (int a = 1; a <= n; a++) {
9
10            // Looping through all values of 'b' from 1 to n
11            for (int b = 1; b <= n; b++) {
12
13                // Calculating a² + b²
14                int c_sq = a * a + b * b;
15
16                // Taking the square root to get potential value of 'c'
17                int c = (int) Math.sqrt(c_sq);
18
19                // Checking if c*c equals c_sq (perfect square) and c is not exceeding n
20                if (c * c == c_sq && c <= n) {
21
22                    // Increasing count when a valid triple (a, b, c) is found
23                    count++;
24                }
25            }
26        }
27
28        // Returning the final count of valid triples
29        return count;
30    }
31}
32