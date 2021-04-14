package zad3;

public class Tomato extends PizzaDecorator {

    public Tomato(Pizza newPizza) {
        super(newPizza);
        System.out.println(" dodano pomidory ");
    }

    public String getDescription(){
        return ingredient.getDescription() + " pomidory ";
    }

    public double getCost(){
        return ingredient.getCost() + 1.00;
    }

}
