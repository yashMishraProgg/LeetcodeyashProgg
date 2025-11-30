// Last updated: 11/30/2025, 11:56:45 PM
1class Solution {
2    public int minSubarray(int[] nums, int p) {
3        int n = nums.length;
4        int res_len = n; // store the minimum length of subarray to remove, start with max possible (n)
5
6        Map<Integer, Integer> map = new HashMap<>();
7        map.put(0, -1); // prefix remainder 0 appears before array starts (helps handle cases starting from index 0)
8
9        long total_sum = 0; 
10        for (int num : nums) {
11            total_sum += num; // calculate total sum of array
12        }
13
14        int total_remainder = (int) (total_sum % p); // what remainder we need to remove
15        if (total_remainder == 0) return 0; // if already divisible by p, remove nothing
16
17        long prefix_sum = 0; // running prefix sum
18        for (int i = 0; i < n; i++) {
19            prefix_sum += nums[i];
20            
21            // current remainder of prefix sum
22            int curr_remainder = (int) (prefix_sum % p);
23
24            // we need a previous prefix remainder that fulfills:
25            // curr_remainder - prev == total_remainder  (mod p)
26            int target_remainder = (curr_remainder - total_remainder + p) % p;
27
28            // If we've seen this remainder before, a valid subarray exists
29            if (map.containsKey(target_remainder)) {
30                int len = i - map.get(target_remainder); // length of subarray to remove
31                res_len = Math.min(res_len, len); // keep minimum
32            }
33
34            // store or update the index of the current remainder
35            map.put(curr_remainder, i);
36        }
37
38        // If result length is still n, we found nothing valid → return -1
39        return (res_len == n) ? -1 : res_len;
40    }
41}
42