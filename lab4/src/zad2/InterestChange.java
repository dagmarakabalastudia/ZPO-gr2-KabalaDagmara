package zad2;

public class InterestChange implements Operation{
    Account account;
    Interest interest;

    public InterestChange(Account account, Interest interest){
        this.account = account;
        this.interest = interest;
    }

    public void execute(){
        account.interestChange(interest);
    }
}
