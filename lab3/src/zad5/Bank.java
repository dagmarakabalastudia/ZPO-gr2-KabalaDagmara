package zad5;

import java.util.ArrayList;

public class Bank implements Observer{
    private Integer uniqueIDNumber;
    private ArrayList<String> Companies = new ArrayList<String>();
    private ArrayList<Double> Values  = new ArrayList<Double>();

    private String name;
    private Subject stock;
    private Double balance;

    public Bank(Subject stock, String name, Integer uniqueIDNumber, Double balance){
        this.stock = stock;
        this.name = name;
        this.balance = balance;
        this.uniqueIDNumber = uniqueIDNumber;
        stock.register(this);
    }

    public Double getBalance(){
        return this.balance;
    }

    public Double getValueByCompany(String company){
        int index = Companies.indexOf(company);
        return Values.get(index);
    }
    public void printPrices(){
        System.out.println(name + " obserwuję \n " + Companies + '\n' + Values);
    }

    public void buyStock(int amount, String company){
        double value = getValueByCompany(company);
        if(amount * value > 10000 && amount * value < getBalance()){
            System.out.println(name + " - kupiłem aukcje w firmie " + company + " w ilości " + amount + " za jedną dałem " + value  + " czyli łącznie " + (value*amount));

        } else if (amount * value < 10000){
            System.out.println(name + " - Nie warto zawracać sobie głowy tą aukcją");
        } else {
            System.out.println(name + " - nie mam wystarczających funduszy");
        }
    }
    public void sellStock(int amount, String company){
        double value = getValueByCompany(company);
        System.out.println(name + " - sprzedałem aukcje w firmie " + company + " w ilości " + amount + " za jedną dałem " + value  + " czyli łącznie " + (value*amount));
    }

    public void printAverage(){
        System.out.println(name + " - Nie mam dostępu do takich danych");
    }
    @Override
    public void update(ArrayList<String> Companies, ArrayList<Double>Values) {
        this.Companies = Companies;
        this.Values = Values;
        printPrices();
    }
}