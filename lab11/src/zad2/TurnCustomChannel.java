package zad2;

public class TurnCustomChannel extends State {

    public TurnCustomChannel(TV tv, int channel) {
        super(tv);
        tv.setState(this);
        tv.setChannels(channel);
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
        return null;
    }

    @Override
    public String onCustomChannel() {
        return "zmieniono kanał na wybrany" ;
    }

    @Override
    public String showChannel() {
        return null;
    }
}
