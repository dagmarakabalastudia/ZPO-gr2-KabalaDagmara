package zad2;

public class TurnShowChannel extends State{
    int currentChannel;
    public TurnShowChannel(TV tv){
        super(tv);
        tv.setOnOff(false);
        this.currentChannel = tv.getChannel();
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
        return null;
    }

    @Override
    public String showChannel() {
        return "pokazuję aktualny kanał " + this.currentChannel;
    }

}
