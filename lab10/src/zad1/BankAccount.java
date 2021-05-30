package zad1;

public class BankAccount {
    double accountBalance;
    String name;
    Withdraw withdraw = new Withdraw();
    Deposit deposit = new Deposit();
    Transfer transfer = new Transfer();

    public BankAccount(double accountBalance, String name ){
        this.accountBalance = accountBalance;
        this.name = name;

    }

    public void getAccountBalance(){
        System.out.println("Witaj " + this.name + " na koncie posiadasz " + String.format("%.2f",this.accountBalance) + "zł");
    }
}
