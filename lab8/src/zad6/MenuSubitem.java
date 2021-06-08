package zad6;

public class MenuSubitem extends MenuItem {
    String name;

    public MenuSubitem(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void print(){
        System.out.println(getName());
    }
}
