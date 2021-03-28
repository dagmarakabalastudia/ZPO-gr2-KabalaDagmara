package zad3;

import java.util.Scanner;

public class GreaterThanZero implements Observer {
    int key;
    @Override
    public void update(int k){
        System.out.println("Ten obserwator obserwuje liczby większe od zero");
        if(k > 0){
            key = k;
            printResult();
        }
    }
    public void printResult(){
        System.out.println("Wykryto liczbę większą od zera " + key);
    }
}
