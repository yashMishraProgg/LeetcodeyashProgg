class Solution {
    public boolean rotateString(String s, String goal) {
        //Basically we've to check that its rotation s
        //should be present in the goal or not
        //str + str = abcdeabcde
        //every goal will lie in this

        if(s.length() != goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}