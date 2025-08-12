// Last updated: 8/12/2025, 8:15:43 PM
class Solution {
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;

    }
}
// class Solution {
//     public int romanToInt(String s) {
//         // here we use hashmap to map symbols to value
//         HashMap<Character, Integer> map = new HashMap<>();
//         map.put('I', 1);
//         map.put('V', 5);
//         map.put('X', 10);
//         map.put('L', 50);
//         map.put('C', 100);
//         map.put('D', 500);
//         map.put('M', 1000);

//         int result = map.get(s.charAt(s.length() - 1)); // we start from last char

//         for (int i = s.length() - 2; i >= 0; i--) { // start from second last index to compare values
//             if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) { 
//                 // i.e in "MCMXCIV" => here i(1) < i+1(5) = 5-1 that is IV(4)
//                 result = result - map.get(s.charAt(i));
//             } else {
//                 result = result + map.get(s.charAt(i));
//             }
//         }
//         return result;
//     }
// }
