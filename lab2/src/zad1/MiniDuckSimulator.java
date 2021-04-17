package zad1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck[] arrayDuck = new Duck[3];
        arrayDuck[0] = new DuckOrdinary("Pierwsza");
        arrayDuck[1] = new RubberDuck("Druga ");
        arrayDuck[2] = new DuckOrdinary("Trzecia");
        ArrayList<Duck> listDuck = new ArrayList();
        listDuck.add(new DuckOrdinary("lista Pierwsza"));
        listDuck.add(new RubberDuck("Lista Druga"));
        listDuck.add(new DuckOrdinary("Lista Trzecia"));

        BubbleSort bubble = new BubbleSort();
        Duck[] sortedArray = bubble.Sort(arrayDuck);
        ArrayList<Duck> sortedList = bubble.Sort(listDuck);
        for(Duck duck : sortedArray){
            duck.printName();
        }
        for(Duck duck : sortedList){
            duck.printName();
        }
    }
}
