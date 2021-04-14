package zad3;

public class WithoutCheese extends PizzaDecorator {
    public WithoutCheese(Pizza newPizza) {
        super(newPizza);
        System.out.println("  bez sera ");
    }
    public String getDescription(){
        return ingredient.getDescription() + " bez sera ";
    }

    public double getCost(){
        return ingredient.getCost() - 3.00;
    }

}
