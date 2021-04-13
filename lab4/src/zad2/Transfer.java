package zad2;

public class Transfer implements Operation {
    Account from;
    Account to;
    Double money;

    public Transfer(Account from, Account to, Double money){
        this.from = from;
        this.to = to;
        this.money = money;
    }

    public void execute(){
        from.subtractFromBalance(money);
        to.addToBalance(money);
        System.out.println("Wykonano przelew ");
    }
}
