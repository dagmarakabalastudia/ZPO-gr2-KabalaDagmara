package zad3;

public class Main {
    public static void main(String[] args) {

        PizzaDecorator basicPizza = new Margarita();
        PizzaDecorator PizzaWithTomato = new Tomato(basicPizza);
        PizzaDecorator PizzaWithTomatoAndHam = new Ham(PizzaWithTomato);
        PizzaDecorator PizzaWithTomatoAndHamWithoutCheese = new WithoutCheese(PizzaWithTomatoAndHam);
        PizzaDecorator PizzaWithOlives = new Olives(basicPizza);
        PizzaDecorator PizzaWithOlivesWithoutSouse = new WithoutSouse(PizzaWithOlives);

        System.out.println("Zamówienie: " + PizzaWithTomatoAndHam.getDescription() + " Cena: " + PizzaWithTomatoAndHam.getCost());

        System.out.println("Zamówienie: " + PizzaWithTomatoAndHamWithoutCheese.getDescription() + " Cena: " + PizzaWithTomatoAndHamWithoutCheese.getCost());

        System.out.println("Zamówienie: " + PizzaWithOlivesWithoutSouse.getDescription() + " Cena: " + PizzaWithOlivesWithoutSouse.getCost());

    }
}
