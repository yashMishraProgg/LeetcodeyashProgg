class Solution {

     private int getSquare(int n){
        int ans = 0;
        
        while(n>0){
            int rem = n%10;
            ans +=  rem*rem;
            n/=10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        
    //this is fast and slow pointer method ques in disguise
    int slow = n;
    int fast = n;

    do{
        slow = getSquare(slow); //*1
        fast =  getSquare(getSquare(fast)); //*2
    }while(fast!=slow);

    if(slow == 1){
        return true;
    }else{
        return false;
    }
}

}
