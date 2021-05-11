package zad1;

import java.util.Scanner;

public class Keyboard implements IFile{

    @Override
    public int[] executeOperation(int[] array, int n) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("podaj " + n + " liczb");
        for(int i = 0; i < array.length; i++){
            System.out.print("Podaj liczbę: \t ");
            int k = keyboard.nextInt();
            array[i] = k;
        }
        System.out.println("Zczytano wartości wpisywane");
        return array;
    }

}
