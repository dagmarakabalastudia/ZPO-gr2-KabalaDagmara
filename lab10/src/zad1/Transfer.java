package zad1;

public class Transfer  implements Transaction{

    @Override
    public void doIt(BankAccount account, BankAccount account2, double amount) {
        account.accountBalance = account.accountBalance - amount;
        account2.accountBalance = account2.accountBalance + amount;
        System.out.println(" Przelano " + amount + "zł");

    }
}
