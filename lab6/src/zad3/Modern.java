package zad3;

public class Modern implements Factory{

    @Override
    public Armchair createArmchair() {
        return new ModernArmchair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable creteCoffeeTable() {
        return new ModernCoffeeTable();
    }
}