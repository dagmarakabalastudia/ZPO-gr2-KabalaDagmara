package zad1;

public class Deposit implements Transaction{

    @Override
    public void doIt(BankAccount account, BankAccount account2,  double amount) {
        account.accountBalance = account.accountBalance + amount;
        System.out.println(" Wpłacono " + amount + "zł");

    }
}
