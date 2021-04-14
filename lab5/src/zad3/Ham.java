package zad3;

public class Ham extends PizzaDecorator {

    public Ham(Pizza newPizza) {
        super(newPizza);
        System.out.println(" dodano szynkę ");
    }

    public String getDescription(){
        return ingredient.getDescription() + " szynka ";
    }

    public double getCost(){
        return ingredient.getCost() + 4.00;
    }

}
