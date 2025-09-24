class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        // normal mathematics but we convert int to str
        // edge cases here => 

        if(numerator == 0){
            return "0";
        }

        StringBuilder result = new StringBuilder();

        // sign 
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        long absNum = Math.abs((long) numerator);
        long absDen = Math.abs((long) denominator);

        long divideNum = absNum / absDen;
        result.append(divideNum);

        
        long remain = absNum % absDen;
        if(remain == 0){ 
            // return the result cause it's an even division
            return result.toString();
        }

        // if remain != 0 -> make a map cause if remain is 1 and it occurs again then add brackets and stop the process
        Map<Long,Integer> map = new HashMap<>();

        result.append("."); 

        while(remain != 0){
            if(map.containsKey(remain)){
                result.insert(map.get(remain), "("); // cause 1 has occurred again so finish the process and insert brackets at remainder position
                result.append(")");
                break; 
            }

            map.put(remain, result.length());

            remain *= 10;

            result.append(remain / absDen);

            remain %= absDen;
        }

        return result.toString();
    }
}
