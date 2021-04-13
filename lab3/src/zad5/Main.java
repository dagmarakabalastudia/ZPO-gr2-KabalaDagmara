package zad5;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        stock.addCompany("Firma1", 100000.00);
        stock.addCompany("Firma2", 50.00);
        stock.addCompany("Firma3", 9000000.00);
        stock.addCompany("Firma4", 300000.00);
        stock.addCompany("Firma5", 310000.00);
        stock.addCompany("Firma6", 3000.00);
        IndividualClient client1 = new IndividualClient(stock, "klient", "pierwszy", 1000.00);
        IndividualClient client2 = new IndividualClient(stock, "klient", "drugi", 40000.99);
        IndividualClient client3 = new IndividualClient(stock, "klient", "trzeci", 790.00);
        MinisterFinance minister = new MinisterFinance(stock, "minister", "Finansów", 1000000.00);
        Bank bank = new Bank(stock, "Bank Główny Obiektowy", 12, 100000000000.06);
        stock.changeCompanyValue("Firma2",100.50);
        stock.changeCompanyValue("Firma2",1234569.00);
        stock.addCompany("Firma7", 99.99);
        stock.unregister(client1);
        stock.changeCompanyValue("Firma1", 10.00);
        stock.removeCompany("Firma7");
        client3.buyStock(1, "Firma2");
        minister.buyStock(800, "Firma3");
        minister.buyStock(1,"Firma4");
        bank.buyStock(110, "Firma1");
        client2.buyStock(19,"Firma3");
        client2.buyStock(19,"Firma2");
        client3.sellStock(50,"Firma2");
        minister.sellStock(150,"Firma5");
        bank.sellStock(5,"Firma2");
        client2.printAverage();
        minister.printAverage();
        bank.printAverage();

    }
}
