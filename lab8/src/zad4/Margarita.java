package zad4;

public class Margarita extends Pizza{

    @Override
    void prepareDough() {
        System.out.println("Przygotuj cienkie ciasto.");
    }

    @Override
    void addTomatoSouse() {
        System.out.println("\nDodaj sos pomidorowy.");
    }

    @Override
    void addIngredients() {
        System.out.println("\nDodaj ser mozzarella.");
        System.out.println("\nDodaj ser mozzarella.");
        System.out.println("\nDodaj bazylię oraz odrobinę oliwy.");
    }

    void bakeFor15min() {
        System.out.println("\nPiecz przez około 15 minut");
    }

}