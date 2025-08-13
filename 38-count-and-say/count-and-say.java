class Solution {
    public String countAndSay(int n) {
    
        //base case 
        if(n == 1){
            return "1";
        }
        String say = countAndSay(n-1);
        StringBuilder result = new StringBuilder(); 
         
        int count = 1; //to count no of times a char occurs
        for(int i=1;i<say.length();i++){
            if(say.charAt(i) == say.charAt(i-1)){  //"11" = count(2)
                count++;
            }else{
                result.append(count).append(say.charAt(i-1));//"11" = "count(2)" + "char(1)" => 21
                count = 1;//if say.charAt(i) != say.charAt(i-1)
            }
        }
        result.append(count).append(say.charAt(say.length() - 1)); //last char count + char
        return result.toString();
    }
}