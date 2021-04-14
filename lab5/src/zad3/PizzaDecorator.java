package zad3;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza ingredient;

    public PizzaDecorator(Pizza newPizza){
        this.ingredient = newPizza;
    }

    public String getDescription(){
        return ingredient.getDescription();
    }

    public double getCost(){
        return ingredient.getCost();
    }

    public Pizza getSubject() {
        return ingredient;
    }

}
