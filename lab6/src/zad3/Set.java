package zad3;

public class Set {
    private Armchair armchair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public Set(Factory factory){
        armchair = factory.createArmchair();
        sofa = factory.createSofa();
        coffeeTable = factory.creteCoffeeTable();
    }
    public void printName() {
        armchair.armchair();
        sofa.sofa();
        coffeeTable.coffeeTable();
    }
}
