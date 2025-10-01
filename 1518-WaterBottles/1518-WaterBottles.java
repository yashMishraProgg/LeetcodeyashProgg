// Last updated: 10/1/2025, 11:36:18 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        //intuiton is at the end
        //numbottles(same filled = same empty)
        //at the end you get net only 1 left  => (numBottles -1)
        // Each extra drink costs (numExchange - 1)

        int sum = (numBottles-1)/(numExchange-1);

        return sum+numBottles;
        
    }
}