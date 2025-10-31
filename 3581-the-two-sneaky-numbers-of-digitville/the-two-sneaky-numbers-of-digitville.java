class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int[] freq = new int[max + 1];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        for (int i = 0; i <= max; i++) {
            if (freq[i] == 2) {
                list.add(i);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
