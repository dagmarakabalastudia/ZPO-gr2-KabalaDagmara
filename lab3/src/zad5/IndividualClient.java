package zad5;

import java.util.ArrayList;

public class IndividualClient implements Observer {
    private String surname;
    private ArrayList<String> Companies = new ArrayList<String>();
    private ArrayList<Double> Values  = new ArrayList<Double>();

    private String name;
    private Subject stock;
    private Double balance;

    public Double getValueByCompany(String company){
        int index = Companies.indexOf(company);
        return Values.get(index);
    }
    public Double getBalance(){
        return this.balance;
    }
    public IndividualClient(Subject stock, String name, String surname, Double balance){
        this.stock = stock;
        this.name = name;
        this.balance = balance;
        this.surname = surname;
        stock.register(this);
    }

    public void buyStock(int amount, String company){
        double value = getValueByCompany(company);
        if(value * amount < this.getBalance()){
            System.out.println(name + " " + surname + " - Kupiłem aukcje w firmie " + company + " w ilości " + amount + " za jedną dałem " + value  + " czyli łącznie " + (value*amount));
            ;
        } else {
            System.out.println(name + " " + surname + " - Nie mam wystarczających funduszy");
        }
    }

    public void sellStock(int amount, String company){
        double value = getValueByCompany(company);
        System.out.println(name + " " + surname + " - sprzedałem aukcje w firmie " + company + " w ilości " + amount + " za jedną dałem " + value  + " czyli łącznie " + (value*amount));
    }

    public void printAverage(){
        System.out.println(name + " " + surname + " - Nie mam dostępu do takich danych");
    }

    public void printPrices(){
        System.out.println(name+ " " + surname +  " obserwuję \n " + Companies + '\n' + Values);
    }
    @Override
    public void update(ArrayList<String> Companies, ArrayList<Double>Values) {
        this.Companies = Companies;
        this.Values = Values;
        printPrices();
    }
}
