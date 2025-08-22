// Last updated: 8/22/2025, 11:31:24 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        //basically we have to expand row and col if we see 1
        //width = maxRow-minRow+1 vice versa
        int minRow = m;
        int maxRow = -1;
        int minCol = n;
        int maxCol = -1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    maxRow = Math.max(maxRow,i);
                    minRow = Math.min(minRow,i);

                    maxCol = Math.max(maxCol,j);   
                    minCol = Math.min(minCol,j);
                }
                

            }
        }
        return (maxRow - minRow + 1)*(maxCol - minCol + 1);
    }
}