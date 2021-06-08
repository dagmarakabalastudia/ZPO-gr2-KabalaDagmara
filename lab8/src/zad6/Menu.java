package zad6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuItem {
    ArrayList<MenuItem> menuItems = new ArrayList<>();
    String name;

    public Menu (String name){
        this.name = name;
    }

    public void add(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void pop(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    public MenuItem getLeaf(int p) {
        return menuItems.get(p);
    }

    public String getName() {
        return this.name;
    }

    public void print() throws IOException {
        System.out.println(getName());

        Iterator iterator = menuItems.iterator();
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            menuItem.print();
        }
    }

}
