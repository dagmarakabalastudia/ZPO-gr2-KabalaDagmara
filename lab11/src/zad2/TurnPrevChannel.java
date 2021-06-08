package zad2;

public class TurnPrevChannel extends State{

    public TurnPrevChannel(TV tv){
        super(tv);
        tv.setState(this);
        tv.setChannels(tv.currentChannel - 1);
    }

    @Override
    public String onOffState() {
        return null;
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
        return "zmieniam kanał o jeden w dół";
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