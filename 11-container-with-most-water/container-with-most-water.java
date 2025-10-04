class Solution {
    public int maxArea(int[] height) {
        //logic is clear and simple 
        //decrease the width and keep in mind the height is greater 
        //so the area would be greater
        int i = 0;
        int j = height.length - 1;
        int maxWaterArea = 0;


        while (i < j) {
            int width = j - i;
            int h = Math.min(height[i], height[j]);  // min height decides water level
            int area = width * h;                    

            maxWaterArea = Math.max(maxWaterArea, area); // update max area

            if (height[i] < height[j]) { //jidhar height min => go ahead
                i++;
            } else {
                j--;
            }
        }

        return maxWaterArea;
    }
}
