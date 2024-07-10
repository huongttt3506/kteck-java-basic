package d6.q2;

public class BankAccount {
    private int amount;
    private String password;


    public BankAccount(String password) {
        this.amount = 0;
        this.password = password;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    //deposit
    public boolean deposit(int amount) {
        this.amount += amount;
        return true;
    }
    //withdraw
    public boolean withdraw(int amount, String password) {
        //1. password is wrong
        //2. withdraw amount is greater than balance
        if (!this.password.equals(password) || this.amount < amount) {
            return false;
        }
        this.amount -= amount;
        return true;
    }





}
