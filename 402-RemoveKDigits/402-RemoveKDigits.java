// Last updated: 9/6/2025, 7:46:23 PM
class Solution {
    public String removeKdigits(String num, int k) {
        //simple logic => pop element if previous element is greater than the next element k times 
        //previous > next element => pop previous and add current

        Stack<Character> st = new Stack<>();

        //or char digit  = charAt(i)
        for(char digit : num.toCharArray()){
           while(!st.isEmpty() && k > 0 && st.peek() > digit){
            st.pop();
            k--;  // cause we have to pop till k=0;
           }
           //else push
           st.push(digit);
        }

        //if no previous > next element still remove k from last
          
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;  // cause we have to pop till k=0;
        }
        
        //now concatenate the char/number from poping  out of the stack

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        // as it is stack we have to reverse the order
        sb.reverse();

        //removing leading/starting zeroes

        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
          
        //convert the ans into string
        return sb.length() > 0 ? sb.toString()  : "0";
    }
}