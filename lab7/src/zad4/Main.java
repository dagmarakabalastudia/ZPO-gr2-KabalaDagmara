package zad4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FontStyleFacade fontStyle = new FontStyleFacade();
        String text = "Tekst do edycji";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("co chcesz zrobić z tekstem \n 1 pogrub \n 2 pochyl");
        int k = keyboard.nextInt();
        if(k == 1 ) {
            fontStyle.useBold(text);
        } else if (k ==2) {
            fontStyle.useItalic(text);
        }
        else {
            System.out.println("Nie wybrano żadnej opcji");
        }
    }
}