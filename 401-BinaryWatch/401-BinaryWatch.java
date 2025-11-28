// Last updated: 11/28/2025, 9:50:48 PM
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String> result = new ArrayList<>();
4
5        for (int hour = 0; hour < 12; hour++) {
6            for (int minute = 0; minute < 60; minute++) {
7                // Count total ON bits in hour and minute
8                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
9                    result.add(String.format("%d:%02d", hour, minute));
10                }
11            }
12        }
13
14        return result;
15    }
16}
17