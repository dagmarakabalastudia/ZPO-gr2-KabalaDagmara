package zad2;
import java.util.List;
import java.util.ArrayList;

public class Account {
    private double balance = 0.0;
    private double interestValue = 0.0;
    private List<Operation> operations = new ArrayList<Operation>();
    private Interest interest;

    public Account(double balance, Interest interest){
        this.balance = balance;
        this.interest = interest;
    }

    public void addToBalance(Double value){
        this.balance += value;
    }

    public void subtractFromBalance(Double value){
        this.balance += value;
    }

    public void interestChange(Interest interest){
        this.interest = interest;
    }

    public void doOperation(Operation o){
        o.execute();
    }

    public void addToOperations(Operation o) {
        operations.add(o);
    }

    public void doCalculation(){
        this.interest.compute();
    }

}
