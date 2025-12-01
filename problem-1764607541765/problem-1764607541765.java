// Last updated: 12/1/2025, 10:15:41 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> result = new ArrayList<>();
4
5        for (int i = 0; i < numRows; i++) {
6            List<Integer> row = new ArrayList<>();
7
8            for (int j = 0; j <= i; j++) {
9                if (j == 0 || j == i) {
10                    row.add(1); // First and last elements are always 1
11                } else {
12                    // Sum of two elements from previous row
13                    int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
14                    row.add(val);
15                }
16            }
17
18            result.add(row);
19        }
20
21        return result;
22    }
23}
24