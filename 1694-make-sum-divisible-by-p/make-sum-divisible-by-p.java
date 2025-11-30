class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int res_len = n; // store the minimum length of subarray to remove, start with max possible (n)

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // prefix remainder 0 appears before array starts (helps handle cases starting from index 0)

        long total_sum = 0; 
        for (int num : nums) {
            total_sum += num; // calculate total sum of array
        }

        int total_remainder = (int) (total_sum % p); // what remainder we need to remove
        if (total_remainder == 0) return 0; // if already divisible by p, remove nothing

        long prefix_sum = 0; // running prefix sum
        for (int i = 0; i < n; i++) {
            prefix_sum += nums[i];
            
            // current remainder of prefix sum
            int curr_remainder = (int) (prefix_sum % p);

            // we need a previous prefix remainder that fulfills:
            // curr_remainder - prev == total_remainder  (mod p)
            int target_remainder = (curr_remainder - total_remainder + p) % p;

            // If we've seen this remainder before, a valid subarray exists
            if (map.containsKey(target_remainder)) {
                int len = i - map.get(target_remainder); // length of subarray to remove
                res_len = Math.min(res_len, len); // keep minimum
            }

            // store or update the index of the current remainder
            map.put(curr_remainder, i);
        }

        // If result length is still n, we found nothing valid → return -1
        return (res_len == n) ? -1 : res_len;
    }
}
