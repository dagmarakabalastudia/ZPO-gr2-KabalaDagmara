package zad3;

public class Margarita extends PizzaDecorator {

    public Margarita() {
        super(null);
        System.out.println(" podstawowa pizza (ciasto, sos, ser) ");
    }

    @Override
    public String getDescription() {
        return " pizza ";
    }

    @Override
    public double getCost() {
        return 10.00;
    }

}
