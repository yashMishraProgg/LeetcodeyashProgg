class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
            System.gc();
        List<Integer> result = new ArrayList<>();


        Set<Integer> hashSet = new HashSet<>();

        for (int i : nums) {
            hashSet.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!hashSet.contains(i)) {
                result.add(i);
            }
        }


        return result;
    }
}