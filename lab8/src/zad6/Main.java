package zad6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MenuItem item1 = new Menu("pogrubienie");
        MenuItem item2 = new Menu("pochylenie");
        MenuItem item3 = new Menu("podkreślenie");

        MenuItem menu = new Menu("menu");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        item1.add(new MenuSubitem("400"));
        item1.add(new MenuSubitem("700"));
        item1.add(new MenuSubitem("900"));
        item2.add(new MenuSubitem("tak"));
        item2.add(new MenuSubitem("nie"));
        item3.add(new MenuSubitem("tak"));
        item3.add(new MenuSubitem("nie"));


        System.out.println("wspólny liść i korzeń \n");
        menu.print();

        System.out.println("\noddzielny liść i korzeń");
        item3.print();
        item2.print();
        item1.print();

    }
}
