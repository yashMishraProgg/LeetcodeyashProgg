class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {
           
            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                int sum = a + st.peek();

                if (sum < 0) {  
                    // top khatam
                    st.pop();
                } else if (sum > 0) {  
                    // current khatam
                    a = 0;
                    break;
                } else {  
                    // dono khatam
                    st.pop();
                    a = 0;
                    break;
                }
            }

           
            if (a != 0) {
                st.push(a);
            }
        }

        int n = st.size();
        int[] res = new int[n];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
