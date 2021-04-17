package zad2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TransportManagement transportManagement;
        Factory factory;

        System.out.println("Wybierz opcję transportu \n wciśnij 1 żeby wybrać ciężarówkę \n wciśnij 2 żeby wybrać łódź " );
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println();
        if (k == 1){
            factory = new TruckFactory();
            transportManagement = new TransportManagement(factory);
            transportManagement.transport();
        }
        else if (k == 2){
            factory = new BoatFactory();
            transportManagement = new TransportManagement(factory);
            transportManagement.transport();
        }
        else{
            System.out.println("Nie wybrano sposobu przewozu");
        }

    }
}
