// Last updated: 8/11/2025, 9:56:31 PM
class Solution {
    public int beautySum(String s) {
        // find the substrings and the frequency
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26]; // array to store frequency
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++; // store char at index and increment if occur more than one time
                int beauty = MaxCount(freq) - MinCount(freq);
                sum += beauty;
            }
        }
        return sum;
    }

    public int MaxCount(int[] freq) {
        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, freq[i]);
        }
        return max;
    }

    public int MinCount(int[] freq) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                min = Math.min(min, freq[i]);
            }
        }
        return min;
    }
}
