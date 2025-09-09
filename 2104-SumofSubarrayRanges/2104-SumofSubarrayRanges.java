// Last updated: 9/9/2025, 11:33:11 PM
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long res = 0;
        int mod = 1_000_000_007;

        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();

        //previous smaller (left[i])
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - st.peek();
            }
            st.push(i);
        }

        st.clear();

        // STEP 2: Next Smaller (right[i])
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = st.peek() - i;
            }
            st.push(i);
        }

        // STEP 3: Contribution
        for (int i = 0; i < n; i++) {
            long contrib = (long) arr[i] * left[i] * right[i];
            res = (res + contrib) % mod;
        }

        return (int) res;
    }
}
