// Last updated: 9/16/2025, 10:34:12 PM
class Solution {
    // first create a gcd fn 
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;   
            a = temp;
        }
        return a;
    }

    // also take lcm by a*b/gcd
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();  

        for (int i = 0; i < nums.length; i++) {   
            while (!st.isEmpty()) {

                int prev = st.peek();
                int gcd = gcd(prev, nums[i]);

                if (gcd == 1) {   
                    break;
                }

                // else merge into lcm
                int lcm = prev / gcd * nums[i];  // same as (prev * nums[i]) / gcd
                nums[i] = lcm;
                st.pop();  
            }
            st.push(nums[i]);  
        }
        return new ArrayList<>(st);
    }
}
