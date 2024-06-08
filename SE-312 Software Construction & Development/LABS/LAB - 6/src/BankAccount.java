public class BankAccount {
    private int account_number;
    private int account_balance;
    private String owners_name;

    public BankAccount(int account_balance,int account_number,String owners_name){
        this.account_balance = account_balance;
        this.account_number = account_number;
        this.owners_name = owners_name;
    }
    public void deposit(int amount){
        this.account_balance += amount;
        System.out.println("The amount "+amount+" is deposited into the account:\n"+this.account_number+"\n"+this.owners_name);
    }
    public void checkBalance(){
        System.out.println(this.owners_name+" with account number: "+this.account_number+" has current balance of: "+this.account_balance);
    }
    public void withdraw(int amount){
        this.account_balance = this.account_balance - amount;
        System.out.println("The amount "+amount+" is withdrawn from the account:\n"+this.account_number+"\n"+this.owners_name);
    }
}


