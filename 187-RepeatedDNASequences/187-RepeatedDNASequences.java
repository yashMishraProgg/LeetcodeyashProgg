// Last updated: 12/9/2025, 11:56:28 PM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        //so we need to check 10 letters dna sequence 
4        //this can be done using hashset
5
6        Set<String> seenSequence = new HashSet<>();
7        Set<String> repeatedSequence = new HashSet<>();
8
9        //lets grab 10 starting dna sequence
10
11        for(int i = 0;i<=s.length()-10;i++){
12
13            String tenletters = s.substring(i,i+10);  //first 10
14
15            if(!seenSequence.add(tenletters)){  //if becomes true that means we have added string because its not present and codition becomes false
16               //if already present , add in repeated
17                repeatedSequence.add(tenletters);
18            } 
19        }
20
21       return new ArrayList<>(repeatedSequence);
22    }
23}