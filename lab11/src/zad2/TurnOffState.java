package zad2;

public class TurnOffState extends State{

    public TurnOffState(TV tv){
        super(tv);
        tv.setOnOff(false);
        tv.setState(this);
    }

    @Override
    public String onOffState() {
        return "Tv wyłącza się \n";
    }

    @Override
    public String onOnState() {
        return null;
    }

    @Override
    public String onNextChannel() {
        return null;
    }

    @Override
    public String onPrevChannel() {
        return null;
    }
    @Override
    public String onCustomChannel() {
        return null;
    }

    @Override
    public String showChannel() {
        return null;
    }
}