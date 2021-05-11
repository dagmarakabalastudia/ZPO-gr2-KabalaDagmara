package zad4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pizza pizza = null;

        System.out.println("Zamów pizzę \n 1 Pizza Margherita \n 2 Pizza Sycylijska");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        if(k == 1){
            pizza = new Margarita();
        } else if (k == 2){
            pizza = new Sycylijska();
        }

        pizza.process();
        pizza.finishInfo();
    }
}
