// Last updated: 8/9/2025, 12:45:40 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(char c: s.toCharArray()){
            if(c == '('){
                if(count>0){//Cause we've to leave first
                //opening '('
                    sb.append(c);
                }
                count++;//Entered inside outer par
            } else{
                count--;//for closed ')' cause if two closed
                //')' will occur then 1(not added) (0)not added
                if(count>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
