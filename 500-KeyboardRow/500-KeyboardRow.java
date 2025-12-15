// Last updated: 12/15/2025, 11:05:04 PM
1class Solution {
2    public String[] findWords(String[] words) {
3        //list to store the answer
4       ArrayList<String> ans=new ArrayList<>();
5
6       String first = "qwertyuiop";
7
8       String Second ="asdfghjkl";
9
10       String Third="zxcvbnm";
11
12       for(String i : words){
13        
14        //if present add in ans list
15        if(isinrow(i,first) || isinrow(i,Second) || isinrow(i,Third))
16
17         ans.add(i);
18       } 
19       return ans.toArray(new String[0]);
20    }
21    private boolean isinrow(String s,String row){
22      for(char c:s.toCharArray()){
23        if(row.indexOf(Character.toLowerCase(c))==-1){
24            return false;
25        }
26      }
27      return true;
28    }
29}