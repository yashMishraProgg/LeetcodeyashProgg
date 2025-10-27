// Last updated: 10/27/2025, 1:57:00 PM
class Bank {

     private final long[] balance;
     private final int n;

     public Bank(long[] balance) {
        this.balance = balance ; //constructor
        this.n = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        //can only transfer - account is valid and have money > tranfermoney
        //valid account => account>0 && < n
        if(!isvalid(account1) || !isvalid(account2) || balance[account1-1] < money ){ 
            return false;
        }
        balance[account1 - 1] -= money;     //take money from account1
        balance[account2 - 1] += money;     //transfer in 2
        return true; //tranfer successsfull
    }
    
    public boolean deposit(int account, long money) {
        if(!isvalid(account)){
            return false;
        }
        balance[account - 1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!isvalid(account) || balance[account -1] < money){
            return false;
        }

        //withdraw
        balance[account - 1] -= money;
        return true;
    }
    //account is only be valid if > 0 and < n(number)
    private boolean isvalid(int acc){
        return  acc > 0 && acc <= n;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */