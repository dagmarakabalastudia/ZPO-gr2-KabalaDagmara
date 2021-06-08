package zad2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);
        remote.init();
    }
}
