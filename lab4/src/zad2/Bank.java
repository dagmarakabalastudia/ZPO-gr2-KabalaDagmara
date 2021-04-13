package zad2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> Clients = new ArrayList<Account>();

    public void addClient(Account client){
        Clients.add(client);
    }

    public void removeClient(Account client){
        Clients.remove(client);
    }

    public void income(double value){
        for(Account client : Clients){
            client.doOperation(new Income(client, value));
        }
    }

    public void transfer(Account to, double value){
        for(Account client : Clients){
            client.doOperation(new Transfer(client,to,value));
        }
    }

    public void interestChange(Interest intrest){
        for(Account client : Clients){
            client.doOperation(new InterestChange(client,intrest));
        }
    }

}
