package zad3;

public class ArtDeco implements Factory{

    @Override
    public Armchair createArmchair() {
        return new ArtDecoArmchair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable creteCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}