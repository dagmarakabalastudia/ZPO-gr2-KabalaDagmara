package zad3;

public class Victorian implements Factory{

    @Override
    public Armchair createArmchair() {
        return new VictorianArmchair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable creteCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}