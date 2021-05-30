package zad1;

public class Withdraw implements Transaction{

    @Override
    public void doIt(BankAccount account, BankAccount account2, double amount) {
        account.accountBalance = account.accountBalance - amount;
        System.out.println(" Wypłacono " + amount + "zł");
    }
}
