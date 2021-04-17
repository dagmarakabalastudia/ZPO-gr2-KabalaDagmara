package zad1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Order order;
        Factory factory;

        System.out.println("Wybierz rodzaj przesyłki \n wciśnij 1 zeby wybrać wysyłkę pocztą polską \n wciśnij 2 żeby wybrać wysyłkę InPostem (paczkomat) \n wciśnij 3 żeby wybrać wysyłke InPostem (kurier) \n wciśnij 4 żeby wybrać wysyłkę innym kurierem");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println();
        if (k == 1){
            factory = new PostFactory();
            order = new Order(factory);
            order.order();
        }
        else if (k == 2){
            factory = new InPostFactory();
            order = new Order(factory);
            order.order();
        }
        else if (k == 3){
            factory = new InPostCourierFactory();
            order = new Order(factory);
            order.order();
        }
        else if (k == 4){
            factory = new CourierFactory();
            order = new Order(factory);
            order.order();
        }
        else{
            System.out.println("Nie zdefiniowano sposobu wysyłki");
        }
    }
}
