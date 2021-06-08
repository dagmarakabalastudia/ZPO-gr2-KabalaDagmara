package zad2;

public class TurnNextChannel extends State {

    public TurnNextChannel(TV tv) {
        super(tv);
        tv.setState(this);
        tv.setChannels(tv.currentChannel + 1);
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
        return "Zmieniono kanał o jeden wyżej";
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
