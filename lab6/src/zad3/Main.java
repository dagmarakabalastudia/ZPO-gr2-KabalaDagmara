package zad3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Set s;
        Factory factory;

        System.out.println("Wybierz komplet mebli \n wciśnij 1 żeby wybrać komplet nowoczesny \n wciśnij 2 żeby wybrać komplet wiktoriański \n wciśnij 3 żeby wybrać zestaw artDeco " );
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println();
        if (k == 1){
            factory = new Modern();
            s = new Set(factory);
            s.printName();
        }
        else if (k == 2){
            factory = new Victorian();
            s = new Set(factory);
            s.printName();
        }
        else if (k == 3){
            factory = new ArtDeco();
            s = new Set(factory);
            s.printName();
        }
        else{
            System.out.println("Nie wybrałeś zestawu - jezeli żaden z gotowych cię nie interesuje zapraszamy za miesiąc na odsłonę nowego katalogu");
        }
    }
}
