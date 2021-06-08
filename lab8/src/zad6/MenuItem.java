package zad6;
import java.io.IOException;

abstract class MenuItem {
    public void add(MenuItem menuItem){
        throw new UnsupportedOperationException();
    }

    public void pop(MenuItem menuItem){
        throw new UnsupportedOperationException();
    }

    public MenuItem getLeaf(int p){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public void print() throws IOException{
        throw new UnsupportedOperationException();
    }
}
