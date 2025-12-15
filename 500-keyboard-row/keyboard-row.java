class Solution {
    public String[] findWords(String[] words) {
        //list to store the answer
       ArrayList<String> ans=new ArrayList<>();

       String first = "qwertyuiop";

       String Second ="asdfghjkl";

       String Third="zxcvbnm";

       for(String i : words){
        
        //if present add in ans list
        if(isinrow(i,first) || isinrow(i,Second) || isinrow(i,Third))

         ans.add(i);
       } 
       return ans.toArray(new String[0]);
    }
    private boolean isinrow(String s,String row){
      for(char c:s.toCharArray()){
        if(row.indexOf(Character.toLowerCase(c))==-1){
            return false;
        }
      }
      return true;
    }
}