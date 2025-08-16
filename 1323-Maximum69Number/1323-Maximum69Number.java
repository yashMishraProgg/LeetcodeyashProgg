// Last updated: 8/16/2025, 8:22:12 PM
class Solution {
    public int maximum69Number (int num) {
        int placevalue = 0;
        int placeValueSix  = -1;

        int temp = num;
        while(temp > 0){
            int remain = temp % 10;

            if(remain == 6){
                placeValueSix = placevalue;
            }
            temp = temp / 10;
            placevalue++;
        }
        if(placeValueSix == -1){ // never encountered six
            return num;
        }
        return num + (int)(3 * Math.pow(10, placeValueSix));
    }
}
