package zad3;

import java.util.Scanner;

public class EqualsThreeNumber implements Observer{
    int key;

    @Override
    public void update(int k) {
        System.out.println("Ten obserwator obserwuje liczby 3");
        if (k == 3) {
            key = k;
            printResult();
        }
    }

    public void printResult(){
        System.out.println("Wykryto liczbę 3");
    }
}
