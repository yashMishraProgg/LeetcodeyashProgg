class Solution {
    public boolean isValidSudoku(char[][] board) {
        //using hashset to store unique elements
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.'){
                    continue;
                }

                //make 3 string checks
                String row = board[i][j] + "ROW" + i;
                String col = board[i][j] + "COL" + j;
                
                //for 3*3 box
                String box = board[i][j] + "BOX" + (i/3) + "_" + (j/3);

                if(set.contains(row) || set.contains(col) || set.contains(box)){
                    return false;
                }
                
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        return true;
        //logic is basically
        //store i(row),j(col) as a string where a particular number occurs(unique)
        //for 3*3 box we know i/3 and j/3 will be equal in all 
        //like in input  - 
        //8 is at i = 0 -> set one unique string for it
        //8 is at j= 0 -> set one unique string for it
        //8 is at i=0 ,j=0 set one unique string for it
        //here 8 is also present at i =  6, j=0
        //set i got 8 at i = 6 -> unique but
        //here you got 8 at j= 0 , but we got 8 at j=0 before it means its the duplicate so not valid sudoko -> basically make 3 strings
        //if 8 is at [2,2] the i/3 and j/3 - so 8 is at i =0, j=0 we got it before so its dupliacte

    }
}