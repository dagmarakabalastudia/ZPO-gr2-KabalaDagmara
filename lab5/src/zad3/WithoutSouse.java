package zad3;

public class WithoutSouse extends PizzaDecorator {
    public WithoutSouse(Pizza newPizza) {
        super(newPizza);
        System.out.println("  bez sosu ");
    }
    public String getDescription(){
        return ingredient.getDescription() + " bez sosu ";
    }

    public double getCost(){
        return ingredient.getCost() - 1.00;
    }

}
