package zad5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Addition ad = new Addition();
        ad.solve(2, 4);
        Multiplication ml = new Multiplication();
        ml.solve(2, 4);
        Split sp = new Split();
        sp.solve(8, 4);
        Substraction su = new Substraction();
        su.solve(8, 4);
    }
}
