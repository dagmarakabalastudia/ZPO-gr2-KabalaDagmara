package zad2;
import java.util.Scanner;

public class Remote {
    TV tv;
    public Remote(TV tv) {
        this.tv = tv;
    }
    public void onOffState() {
        this.tv.state = new TurnOffState(this.tv);
        System.out.println(this.tv.state.onOffState());
    };
    public void onOnState()
    {
        this.tv.state = new TurnOnState(this.tv);
        System.out.println(this.tv.state.onOnState());

    };
    public void onNextChannel() {
        this.tv.state = new TurnNextChannel(this.tv);
        System.out.println(this.tv.state.onNextChannel());


    };
    public void onPrevChannel() {
        this.tv.state = new TurnPrevChannel(this.tv);
        System.out.println(this.tv.state.onPrevChannel());
    };
    public void onCustomChannel(int channel) {
        this.tv.state = new TurnCustomChannel(this.tv, channel);
        System.out.println(this.tv.state.onCustomChannel());

    };
    public void showChannel() {
        this.tv.state = new TurnShowChannel(this.tv);
        System.out.println(this.tv.state.showChannel());

    };
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public void init() {
        System.out.println("wybierz co chcesz zrobić");
        System.out.println("a - włącz");
        System.out.println("b - wyłącz");
        System.out.println("c - kanał w dół");
        System.out.println("d - kanał w górę");
        System.out.println("e - pokaż aktualny kanał");
        System.out.println("liczba - wybrany kanał \n");
        Scanner in = new Scanner(System.in);
        String k = in.nextLine();

        if(k.equals("a")) {
            this.onOffState();
        }
        if(k.equals("b")) {
            this.onOnState();
        }
        if(k.equals("c")) {
            this.onPrevChannel();
        }
        if(k.equals("d")) {
            this.onNextChannel();
        }
        if(k.equals("e")) {
            this.showChannel();
        }
        if(isNumeric(k)) {
            this.onCustomChannel(Integer.parseInt(k));
        }
    }
}
