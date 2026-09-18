public class BankAccount {
    private String name;
    private double balance;
    private int accountNumber;
    //
    public BankAccount(String n, int accNum){
        name=n;
        accountNumber=accNum;
        balance=0.0;
    }
    public BankAccount(String n, int accNum, double bal){
        name=n;
        accountNumber=accNum;
        balance=bal;
    }
    //
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
    public int getAccountNum(){
        return accountNumber;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "name: "+name+"\naccountNumber: "+accountNumber+"\nbalance: "+balance;
    }
}