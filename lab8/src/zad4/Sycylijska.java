package zad4;

public class Sycylijska extends Pizza{

    @Override
    void prepareDough() {
        System.out.println("Przygotuj grube ciasto.");
    }

    @Override
    void addTomatoSouse() {
        System.out.println("\nDodaj sos pomidorowy.");
    }

    @Override
    void addIngredients() {
        System.out.println("\nDodaj oliwki i kapary.");
        System.out.println("\nDodaj przyprawy.");
    }

    void bakeFor15min() {
        System.out.println("\nPiecz przez około 15 minut");
    }

}