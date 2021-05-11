package zad4;

abstract class Pizza {
    String name;

    Pizza() {}

    public void process(){
        prepareDough();
        addTomatoSouse();
        addIngredients();
        bakeFor15min();
    }

    abstract void prepareDough();
    abstract void addTomatoSouse();
    abstract void addIngredients();
    abstract void bakeFor15min();
    public void finishInfo() {
        System.out.println("\n Pizza gotowa");
    };
}
