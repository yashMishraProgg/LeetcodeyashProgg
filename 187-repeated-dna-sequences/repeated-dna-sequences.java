class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        //so we need to check 10 letters dna sequence 
        //this can be done using hashset

        Set<String> seenSequence = new HashSet<>();
        Set<String> repeatedSequence = new HashSet<>();

        //lets grab 10 starting dna sequence

        for(int i = 0;i<=s.length()-10;i++){

            String tenletters = s.substring(i,i+10);  //first 10

            if(!seenSequence.add(tenletters)){  //if becomes true that means we have added string because its not present and codition becomes false
               //if already present , add in repeated
                repeatedSequence.add(tenletters);
            } 
        }

       return new ArrayList<>(repeatedSequence);
    }
}