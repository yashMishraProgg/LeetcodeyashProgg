// Last updated: 8/5/2025, 7:45:17 PM
class Solution {    
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr : image) {
            for (int i = 0; i < (image[0].length +1) / 2; i++) {
                int temp = arr[i] ^ 1;
                arr[i] = arr[arr.length - 1 - i] ^ 1;
                arr[arr.length - 1 - i] = temp;
            }
        }
        return image;
    }
}