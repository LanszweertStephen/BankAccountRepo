package bankaccountpackage;


public class BankAccount {
    private double balance;
    
    public BankAccount(){
        
    }
    public void deposit(double amount){
        if (amount > 0)
            balance += amount;
    }  

    public double getBalance() {
        return balance;
    }
    
}
