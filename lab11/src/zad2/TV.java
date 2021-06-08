package zad2;

import java.util.ArrayList;
import java.util.List;

public class TV {
    public State state= new TurnOffState(this);
    public boolean isOnOff = false;
    public int currentChannel = 0;

    public TV(){
    }

    public void setChannels(int channel){
        this.currentChannel = channel;
    }
    public int getChannel(){
        return this.currentChannel;
    }

    public void setOnOff(boolean isOn) {
        this.isOnOff = isOn;
    }
    public State getState() {
        return this.state;
    }
    public void setState(State state) {
        this.state = state;
    }
}