package zad3;

public class Olives extends PizzaDecorator {
    public Olives(Pizza newPizza) {
        super(newPizza);
        System.out.println(" dodano oliwki ");
    }
    public String getDescription(){
        return ingredient.getDescription() + " oliwki ";
    }

    public double getCost(){
        return ingredient.getCost() + 2.00;
    }

}
