package zad3;


import java.util.Scanner;

public class Main {

    public static void printStartMessage(){
        System.out.println("Witaj w aplikacji obserwator, na początek wybierz jakie liczby chcesz obserwować" + System.lineSeparator() + " 1. Większe od 0." + System.lineSeparator() + " 2. Równe 3" + System.lineSeparator() + " 3. Podzielne przez 2" + System.lineSeparator() + " Wprowadź wybraną liczbę:");
    }

    public static void printChangeMessage(){
        System.out.println("Widzę że postanowiłeś/-łaś zmienić obserwatora, co teraz robimy?" + System.lineSeparator() + " 1. Większe od 0." + System.lineSeparator() + " 2. Równe 3" + System.lineSeparator() + " 3. Podzielne przez 2" + System.lineSeparator() + " Wprowadź wybraną liczbę:");
    }

    public static void printLastMessage(int key){
        System.out.println("Wybrałeś/-łaś " + key);
        String which = null;
        if(key == 1) {
            which = " liczb wiekszych od zera ";
        }
        if(key == 2) {
            which = "liczby 3 ";
        }
        if(key == 3) {
            which = " liczb parzystych ";
        }
        System.out.println("Wybrany obserwator " + which + " (zawsze możesz zmienić obserwatora wciskając 0) ");
    }

    public static void main(String[] args) {

        Program program = new Program();
        Scanner sc= new Scanner(System.in);
        printStartMessage();
        int key = sc.nextInt();
        program.selectObserver(key);
        if(key < 4) {
            printLastMessage(key);
        }
        else {
            System.out.println("oj zła liczba, wybierz inną");
            key = sc.nextInt();
            program.selectObserver(key);
        }
        while(true){
            key = sc.nextInt();
            if(key == 0)
            {
                program.unregister();
                printChangeMessage();
                key = sc.nextInt();
                program.selectObserver(key);
                if(key < 4) {
                    printLastMessage(key);
                }
                else {
                    System.out.println("oj zła liczba, wybierz inną");
                    key = sc.nextInt();
                    program.selectObserver(key);
                }
            }
            else {
                program.addValue(key);

            }
        }
    }
}
