package zad1;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100, "Pierwszy");
        BankAccount account2 = new BankAccount(300, "Drugi");

        account.getAccountBalance();
        account2.getAccountBalance();
        account.withdraw.doIt(account, account, 11);
        account.getAccountBalance();

        account.deposit.doIt(account, account, 50);
        account.getAccountBalance();

        account.transfer.doIt(account, account2, 12.95);
        account.getAccountBalance();
        account2.getAccountBalance();

    }
}
