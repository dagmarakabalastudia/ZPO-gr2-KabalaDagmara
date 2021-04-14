package zad3;

public class ExtraCheese extends PizzaDecorator {
    public ExtraCheese(Pizza newPizza) {
        super(newPizza);
        System.out.println(" dodano dodatkowy ser ");
    }
    public String getDescription(){
        return ingredient.getDescription() + " dodatkowy ser ";
    }

    public double getCost(){
        return ingredient.getCost() + 5.00;
    }

}
