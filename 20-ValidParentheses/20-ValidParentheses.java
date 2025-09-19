// Last updated: 9/19/2025, 10:21:16 PM
class Solution {
    public boolean isValid(String s) {
        //simple logic => use stack
        //if ( => push and check if ) is not equal to top => pop()
        // if stack is empty => valid parenthesis

        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch  == '(' || ch == '[' || ch == '{' ){
                stack.push(ch); 
            }
            else{
                
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(ch == ')' && top != '(' ||
                  
                  ch == ']' && top != '[' ||

                  ch == '}' && top != '{'
                ){
                    return false;
                }
            }
        }
       return stack.isEmpty();
    }
}