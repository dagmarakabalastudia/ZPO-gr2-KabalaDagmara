package zad2;

public class Income implements Operation {
    Account account;
    Double money;

    public Income(Account account, Double money){
        this.account = account;
        this.money = money;
    }

    public void execute(){
        account.addToBalance(money);
        System.out.println("Wpłata ");
    }
}