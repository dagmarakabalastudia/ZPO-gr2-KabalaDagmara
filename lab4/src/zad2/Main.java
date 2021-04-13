package zad2;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Interest interestA = new InterestA();
        Interest interestB = new InterestB();
        Interest interestC = new InterestC();
        Account acc1 = new Account(123.00, interestA);
        Account acc2 = new Account(1234.00, interestC);
        Account acc3 = new Account(12345.00, interestB);
        bank.addClient(acc1);
        bank.addClient(acc2);
        bank.addClient(acc3);
        acc3.doOperation(new InterestChange(acc1, interestB));
        acc3.doOperation(new InterestChange(acc3, interestC));
        acc1.addToOperations(new Income(acc3, 100.00));
        acc1.addToOperations(new Income(acc1, 99.99));
        acc1.addToOperations(new Transfer(acc3, acc1, 10.00));
        acc3.doCalculation();
        acc1.doOperation(new Income(acc1, 5.00));
        acc1.doOperation(new Transfer(acc1, acc3, 10.00));
        bank.income(300);
        bank.interestChange(interestA);
        bank.transfer(acc1, 100);
        bank.removeClient(acc2);


    }
}
