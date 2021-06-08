package zad2;

public class TurnOnState extends State{

    public TurnOnState(TV tv){
        super(tv);
        tv.setOnOff(true);
        tv.setState(this);
    }

    @Override
    public String onOffState() {
        return null;
    }

    @Override
    public String onOnState() {
        return "Tv włącza się \n";
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