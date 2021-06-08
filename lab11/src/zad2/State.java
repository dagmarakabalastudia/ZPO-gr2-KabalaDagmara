package zad2;

public abstract class State {
    TV tv;

    public State(TV tv) {
        this.tv = tv;
    }

    public abstract String onOffState();
    public abstract String onOnState();
    public abstract String onNextChannel();
    public abstract String onPrevChannel();
    public abstract String onCustomChannel();
    public abstract String showChannel();
}