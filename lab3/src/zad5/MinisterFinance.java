package zad5;
import java.util.ArrayList;
public class MinisterFinance implements Observer {
    private String surname;

    private ArrayList<String> Companies = new ArrayList<String>();
    private ArrayList<Double> Values  = new ArrayList<Double>();

    private String name;
    private Subject stock;
    private Double balance;

    public MinisterFinance(Subject stock, String name, String surname, Double balance){
        this.stock = stock;
        this.name = name;
        this.balance = balance;
        this.surname = surname;
        stock.register(this);
    }
    public ArrayList<Double> getValues(){
        return Values;
    }

    public Double getBalance(){
        return this.balance;
    }

    public Double getValueByCompany(String company){
        int index = Companies.indexOf(company);
        return Values.get(index);
    }

    public Double getAverage(){
        double sum = 0;
        for(double value : this.getValues()){
            sum += value;
        }
        return sum/this.getValues().size();
    }

    public void buyStock(int amount, String company){
        double value = getValueByCompany(company);
        if(value * amount < this.getBalance()){
            System.out.println(name + " - Kupiłem aukcje w firmie " + company + " w ilości " + amount + " za jedną dałem " + value  + " czyli łącznie " + (value*amount));
        } else {
            System.out.println(name + " - Nie mam wystarczających funduszy");
        }
    }
    public void sellStock(int amount, String company){
        double value = getValueByCompany(company);
        System.out.println( name + " - Sprzedałem aukcje w firmie " + company + " w ilości " + amount + " za jedną dałem " + value  + " czyli łącznie " + (value*amount));
    }

    public void printAverage(){
        System.out.println(name + " - Średnia cena aukcji to  " + getAverage()
        );
    }
    public void printPrices(){
        System.out.println(name + " obserwuję \n " + Companies + '\n' + Values);
    }
    @Override
    public void update(ArrayList<String> Companies, ArrayList<Double>Values) {
        this.Companies = Companies;
        this.Values = Values;
        printPrices();
    }
}