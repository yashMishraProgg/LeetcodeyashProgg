// Last updated: 8/18/2025, 11:41:39 PM
class Solution {
    public boolean judgePoint24(int[] cards) {
        //solving using list
        List<Double> nums = new ArrayList<>();
        
        for(int c: cards){
            nums.add((double) c);
        }
        return game24(nums);
    }

    private boolean game24(List<Double> cards){
        if(cards.size() == 1){//base
            return Math.abs(cards.get(0) - 24.0)< 1e-6;//to handle float
        }

        //logic main
        int n = cards.size();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    continue;
                }

                List<Double> nextArr = new ArrayList<>();

                for(int k = 0;k<n;k++){
                    if(k != i && k!=j){
                        nextArr.add(cards.get(k));
                    }
                }

                double a = cards.get(i);
                double b = cards.get(j);

                List<Double> possible = new ArrayList<>();
                possible.add(a + b);
                possible.add(a - b);
                possible.add(b - a);
                possible.add(a * b);
                if (Math.abs(b) > 1e-6){
                    possible.add(a / b);
                } 
                if (Math.abs(a) > 1e-6){
                    possible.add(b / a);
                } 

                
                for (double val : possible) {
                    nextArr.add(val);                // add result
                    if (game24(nextArr)) return true; // recursive checking
                    nextArr.remove(nextArr.size() - 1); // backtracking 
                }
            }
        }
        return false;
    }
}
